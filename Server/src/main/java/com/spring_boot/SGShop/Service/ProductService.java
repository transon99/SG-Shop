package com.spring_boot.SGShop.Service;

import com.spring_boot.SGShop.Modal.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductService {
    List<Product> findAllProduct();

}
