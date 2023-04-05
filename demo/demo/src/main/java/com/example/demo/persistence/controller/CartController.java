package com.example.demo.persistence.controller;

import com.example.demo.persistence.entity.Cart;
import com.example.demo.persistence.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/carts")
public class CartController {
    @Autowired
    private CartRepository cartRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Cart> getCartById(@PathVariable("id") Integer id) {
        Optional<Cart> cart = cartRepository.findById(id);
        return cart.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("")
    public ResponseEntity<Cart> createCart(@RequestBody Cart cart) {
        Cart savedCart = cartRepository.save(cart);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCart);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCart(@PathVariable("id") Integer id) {
        Optional<Cart> cart = cartRepository.findById(id);
        if (cart.isPresent()) {
            cartRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
