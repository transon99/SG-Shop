package com.spring_boot.SGShop.Modal.responseObj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseObj {
    private String status;
    private String message;
    private Object data;
}
