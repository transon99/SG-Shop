package com.spring_boot.SGShop.service;

import com.spring_boot.SGShop.dto.request.RegisterRequest;
import com.spring_boot.SGShop.dto.response.AuthResponse;

public interface AuthService {
    AuthResponse register(RegisterRequest request);
}
