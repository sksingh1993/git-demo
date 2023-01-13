package com.example.git.service;

import com.example.git.model.Product;

public interface ProductService {
    Product getProduct(Long id);
    void addProduct(Product product);
    Product deleteProduct(Long id);

    Product updateProduct(Product product);

    double getPrice(Long id);
    String getDescription(Long id);

}
