package com.spring_boot.SGShop.jwt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JwtUtils {
    @Value("${application.security.jwt.secret-key}")
    private String jwtSecret;

    @Value("${bezkoder.app.jwtExpirationMs}")
    private Long jwtExpirationMs;

    @Value("${application.security.jwt.refresh-token.expiration}")
    private Long refreshExpiration;
}
