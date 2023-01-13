package com.example.git.controller;

import com.example.git.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping("/")
    public Product getProducts(){
        return new Product(12l,"iPhone",115000.0,"iPhone pro, 256 GB storage");
    }
}
