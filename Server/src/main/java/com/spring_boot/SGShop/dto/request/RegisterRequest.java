package com.spring_boot.SGShop.dto.request;

import com.spring_boot.SGShop.modal.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private Role role;
}
