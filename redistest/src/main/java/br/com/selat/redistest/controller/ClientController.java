package br.com.selat.redistest.controller;

import br.com.selat.redistest.contract.ClientDto;
import br.com.selat.redistest.contract.OperationDeskFilterDto;
import br.com.selat.redistest.service.CacheService;
import br.com.selat.redistest.service.ClientService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService service;
    private final CacheService cacheService;

    public ClientController(ClientService service, CacheService cacheService) {
        this.service = service;
        this.cacheService = cacheService;
    }

    @PostMapping("/filter")
    public ResponseEntity<Page<ClientDto>> findByFilter(@RequestBody OperationDeskFilterDto filter, @PageableDefault(page = 0, size = 10) Pageable pageable)
    {
        String cacheKey = getFindByFilterCacheKey(filter, pageable);
        Page<ClientDto> response = cacheService.getPage(cacheKey, ClientDto.class).orElseGet(() -> {
            Page<ClientDto> serviceResponse = service.createOperationDeskView(filter, pageable);
            cacheService.set(cacheKey, serviceResponse, 10);
            return serviceResponse;
        });
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    private String getFindByFilterCacheKey(OperationDeskFilterDto filter, Pageable pageable){
        return "core/clients/filter/" + filter.hashCode() +
                "/" +
                pageable.toString().hashCode();
    }
}
