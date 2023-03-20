package com.example.demo.controller;

import com.example.demo.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {
    @Autowired
    private CartRepository cartRepository;

    @GetMapping("/")
    public List<CartRepository> getAllCarts() {
        return cartRepository.findAll();
    }

    // other endpoints for cart management
}