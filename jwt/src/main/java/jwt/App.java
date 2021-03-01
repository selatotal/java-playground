package jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.google.gson.Gson;

import java.time.Instant;
import java.util.Date;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    private static String SECRET_1 = "secret1";
    private static String USERNAME_1 = "username1";
    private static String SCOPES_1 = "scope1,scope2";
    private static String REALM_1 = "realm1";

    private static String createToken(String secret, Long expires, String tokenId, String userId, String username, String scopes, String realm){
        Algorithm algorithm = Algorithm.HMAC512(secret);
        Map<String, String> userMap = Stream.of(new String[]{"id", userId }, new String[]{ "username", username }).collect(Collectors.toMap(data -> data[0], data -> data[1]));
        return JWT.create()
                .withExpiresAt(Date.from(Instant.ofEpochMilli(expires)))
                .withIssuedAt(Date.from(Instant.now()))
                .withJWTId(tokenId)
                .withClaim("user", userMap)
                .withClaim("scopes", scopes.toLowerCase())
                .withClaim("realm", realm.toLowerCase())
                .sign(algorithm);
    }

    public static DecodedJWT decodeToken(String token, String secret){
        try {
            Algorithm algorithm = Algorithm.HMAC512(secret);
            JWTVerifier verifier = JWT.require(algorithm)
                    .withClaimPresence("user")
                    .withClaimPresence("scopes")
                    .withClaimPresence("realm")
                    .build();
            return verifier.verify(token);
        } catch (JWTVerificationException e){
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public static void main(String[] args) {
    
        String token1 = createToken(SECRET_1, Instant.now().toEpochMilli()+3600000, UUID.randomUUID().toString(), UUID.randomUUID().toString(), USERNAME_1, SCOPES_1, REALM_1);
        System.out.println(token1);
        DecodedJWT decoded = decodeToken(token1, SECRET_1);

        System.out.println(decoded.getClaim("realm").asString());
        System.out.println(decoded.getClaim("user").asString());
        System.out.println(decoded.getClaim("scopes").asString());
        System.out.println(decoded.getId());
        System.out.println(decoded.getIssuer());
    }
}
