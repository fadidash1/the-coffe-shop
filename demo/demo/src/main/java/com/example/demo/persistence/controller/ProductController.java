package com.example.demo.persistence.controller;

import com.example.demo.persistence.entity.Product;
import com.example.demo.persistence.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> getAllProducts() {

        return ProductRepository.findAllByCategoryProducts();
    }
}
