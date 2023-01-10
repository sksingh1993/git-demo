package com.example.git.service;

import com.example.git.model.Product;

public interface ProductService {
    Product getProduct(Long id);
    void addProduct(Product product);
    Product deleteProduct(Long id);
}
