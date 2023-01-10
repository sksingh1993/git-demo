package com.example.git.service;

import com.example.git.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
    @Override
    public Product getProduct(Long id) {
        return null;
    }

    @Override
    public void addProduct(Product product) {
        Product product3 = new Product();
        Product product4 = new Product();
        Product product5 = new Product();
    }
}
