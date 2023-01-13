package com.example.git.service;

import com.example.git.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
    @Override
    public Product getProduct(Long id) {
        Product product = new Product();
        return new Product();
    }

    @Override
    public void addProduct(Product product) {

        Product product4 = new Product();
        Product product5 = new Product();

        Product prod1 = new Product();
        Product prod2 = new Product();
        Product product3 = new Product();
        Product product6 = new Product();
        Product prod7 = new Product();

        Product product8 = new Product();
        Product product9 = new Product();
        Product product10 = new Product();

        Product prod11 = new Product();
        Product prod12 = new Product();
        Product prod13 = new Product();
    }
    @Override
    public Product deleteProduct(Long id){
        Product product = new Product();
        return product;

    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    @Override
    public double getPrice(Long id){
        return 21.0;

    }

    @Override
    public String getDescription(Long id) {
        return null;
    }

}
