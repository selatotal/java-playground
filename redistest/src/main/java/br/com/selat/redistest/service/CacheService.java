package br.com.selat.redistest.service;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.micrometer.common.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

@Component
public class CacheService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CacheService.class);
    private final RedisTemplate<String, Object> redisTemplate;
    private final ObjectMapper objectMapper;

    public CacheService(RedisTemplate<String, Object> redisTemplate, ObjectMapper objectMapper) {
        this.redisTemplate = redisTemplate;
        this.objectMapper = objectMapper;
    }

    public void set(String key, Object jsonParseableObject, long ttlInSeconds) {
        if (StringUtils.isBlank(key) || jsonParseableObject == null) {
            LOGGER.error("Invalid object");
            return;
        }
        try {
            String jsonString = objectMapper.writeValueAsString(jsonParseableObject);
            redisTemplate.opsForValue().set(key, jsonString, ttlInSeconds, TimeUnit.SECONDS);
            LOGGER.info("Cached Key: {} Value: {}", key, jsonString);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public <T> Optional<T> get(String key, Class<T> classOf) {
        String value = (String) redisTemplate.opsForValue().get(key);
        if (value == null){
            LOGGER.info("MISSED {}", key);
            return Optional.empty();
        }
        LOGGER.info("ADDED TO CACHE: {}", value);
        try {
            return Optional.ofNullable(objectMapper.readValue(value, classOf));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public <T> Optional<Page<T>> getPage(String key, Class<T> classOf){
        String value = (String) redisTemplate.opsForValue().get(key);
        if (value == null){
            LOGGER.info("MISSED {}", key);
            return Optional.empty();
        }
        LOGGER.info("CACHED: {} - {}", key, value);
        try {
            PageImpl<T> page = objectMapper.readValue(value, new TypeReference<RestResponsePage<T>>(){});
            return Optional.of(page);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    static class RestResponsePage<T> extends PageImpl<T> {

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        public RestResponsePage(@JsonProperty("content") List<T> content, @JsonProperty("number") int number, @JsonProperty("size") int size,
                                @JsonProperty("totalElements") Long totalElements, @JsonProperty("pageable") JsonNode pageable, @JsonProperty("last") boolean last,
                                @JsonProperty("totalPages") int totalPages, @JsonProperty("sort") JsonNode sort, @JsonProperty("first") boolean first,
                                @JsonProperty("numberOfElements") int numberOfElements) {
            super(content, PageRequest.of(number, size), totalElements);
        }

        public RestResponsePage(List<T> content, Pageable pageable, long total) {
            super(content, pageable, total);
        }

        public RestResponsePage(List<T> content) {
            super(content);
        }

        public RestResponsePage() {
            super(new ArrayList<>());
        }

    }
}