package com.spring_boot.SGShop.controller;

import com.spring_boot.SGShop.Modal.Address;
import com.spring_boot.SGShop.Modal.Comment;
import com.spring_boot.SGShop.Service.AddressService;
import com.spring_boot.SGShop.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/address")
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping
    public ResponseEntity<?> insertAddress(@RequestBody Address address) {
        return ResponseEntity.ok(addressService.inserAddress(address));
    }
}
