package com.spring_boot.SGShop.Repository;

import com.spring_boot.SGShop.Modal.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
