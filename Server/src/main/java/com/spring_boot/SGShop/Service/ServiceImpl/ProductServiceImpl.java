package com.spring_boot.SGShop.Service.ServiceImpl;

import com.spring_boot.SGShop.Modal.Product;
import com.spring_boot.SGShop.Repository.ProductRepository;
import com.spring_boot.SGShop.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;
    @Override
    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }
}
