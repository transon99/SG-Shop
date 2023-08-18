package com.spring_boot.SGShop.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class ErrorResponse {
    private HttpStatus code;
    private String message;
}
