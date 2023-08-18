package com.spring_boot.SGShop.controller;

import com.spring_boot.SGShop.modal.Address;
import com.spring_boot.SGShop.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/address")
@RequiredArgsConstructor
public class AddressController {
    private final AddressService addressService;

    @PostMapping
    public ResponseEntity<?> createAddress(@RequestBody Address address) {
        return ResponseEntity.ok(addressService.inserAddress(address));
    }
}
