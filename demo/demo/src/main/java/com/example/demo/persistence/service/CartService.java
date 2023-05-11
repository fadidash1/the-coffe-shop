package com.example.demo.persistence.service;


import com.example.demo.persistence.entity.Cart;
import com.example.demo.persistence.entity.User;
import com.example.demo.persistence.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;

    public Cart save(Cart cart) {
        return cartRepository.save(cart);
    }
    public Optional<Cart> findById(Long id) {
        Optional<Cart> optionalCart = cartRepository.findById(id);
        if (!optionalCart.isPresent()) {
            throw new CartService.CartNotFoundException("Cart not found with id: " + id);
        }
        return cartRepository.findById(id);
        }

    public void deleteById(Long id) {

        Optional<Cart> optionalCart = cartRepository.findById(id);
        if (!optionalCart.isPresent()) {
            throw new CartService.CartNotFoundException("Cart not found with id: " + id);
        }
        cartRepository.deleteById(id);
    }

    public class CartNotFoundException extends RuntimeException{
        public CartNotFoundException(String message){
            super(message);
        }
    }
}
