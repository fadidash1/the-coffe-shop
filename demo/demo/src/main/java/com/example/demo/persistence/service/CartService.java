package com.example.demo.persistence.service;


import com.example.demo.persistence.entity.Cart;
import com.example.demo.persistence.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;

    public Optional<Cart> findById(Long id) {
            return cartRepository.findById(id);
        }

    public Cart save(Cart cart) {
        return cartRepository.save(cart);
    }

    public void deleteById(Long id) {
        cartRepository.deleteById(id);
    }
}
