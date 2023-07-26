//package com.spring_boot.SGShop.controller;
//
//import com.spring_boot.SGShop.Service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//
//@RestController
//@RequestMapping("/api/v1/product")
//public class ProductController {
//
//    @Autowired
//    ProductService productService;
//
//    @GetMapping()
//    ResponseEntity<?> getAllProduct() {
//        return ResponseEntity.ok(productService.findAllProduct());
//    };
//
//    @GetMapping(value = "/{id}")
//    ResponseEntity<?> getProductById(){
//        return ResponseEntity.ok(productService.findAllProduct());
//    };
//
//}
