package com.kotalicious.kotabusiness.service;

import com.kotalicious.kotabusiness.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductService {
    Product save(Product product);
    List<Product> findAll();
    Optional<Product> findById(String id);
    void delete(String id);

}
