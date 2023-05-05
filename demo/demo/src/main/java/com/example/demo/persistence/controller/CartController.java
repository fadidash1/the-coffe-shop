package com.example.demo.persistence.controller;

import com.example.demo.persistence.entity.Cart;
import com.example.demo.persistence.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/carts")
public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping("/{id}")
    public Optional<Cart> getCartById(@PathVariable Long id) {
        return cartService.findById(id);
    }

    @PostMapping("/")
    public Cart createCart(@RequestBody Cart cart) {
        return cartService.save(cart);
    }

    @PutMapping("/{id}")
    public Cart updateCart(@PathVariable int id, @RequestBody Cart cart) {
        cart.setId(id);
        return cartService.save(cart);
    }

    @DeleteMapping("/{id}")
    public void deleteCart(@PathVariable Long id) {
        cartService.deleteById(id);
    }

}
