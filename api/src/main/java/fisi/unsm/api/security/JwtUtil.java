package fisi.unsm.api.security;

import java.security.Key;
import java.util.Date;

import org.springframework.stereotype.Component;
import fisi.unsm.api.ApiApplication;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component

public class JwtUtil {

    private final ApiApplication apiApplication;
    private final Key key =Keys.secretKeyFor(SignatureAlgorithm.HS256);
    private final long EXTRATION_TIME = 100L*24*60*60*60*100;


    JwtUtil(ApiApplication apiApplication) {
        this.apiApplication = apiApplication;
    }


    public String generarToken(String clientesId){
        return Jwts.builder()
        .setSubject(clientesId)
        .setIssuedAt( new Date())
        .setExpiration(new Date(System.currentTimeMillis()+EXTRATION_TIME))
        .signWith(key).compact();
    }


    public boolean validarToken(String token){
        try {
            Jwts.parserBuilder()
                .setSigningKey(key).build()
                .parseClaimsJws(token);
            return true;    
        } catch (Exception e) {
            return false;
        }
    }

    public String extraerClienteId(String token){
        return Jwts.parserBuilder()
               .setSigningKey(key).build()
               .parseClaimsJws(token)
               .getBody().getSubject();
    }

    
}
