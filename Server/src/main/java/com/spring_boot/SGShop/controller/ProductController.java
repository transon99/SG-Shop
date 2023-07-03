package com.spring_boot.SGShop.controller;

import com.spring_boot.SGShop.Modal.Product;
import com.spring_boot.SGShop.Modal.responseObj.ResponseObj;
import com.spring_boot.SGShop.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping()
    ResponseEntity<ResponseObj> getAllProduct() {
        return ResponseEntity.status(HttpStatus.OK).body(new ResponseObj("oke","fetch product successfull !!!",productService.findAllProduct()));
    };

    @GetMapping(value = "/{id}")
    ResponseEntity<ResponseObj> getProductById(){
        return ResponseEntity.status(HttpStatus.OK).body(new ResponseObj("oke","fetch product successfull !!!",productService.findAllProduct()));
    };

}
