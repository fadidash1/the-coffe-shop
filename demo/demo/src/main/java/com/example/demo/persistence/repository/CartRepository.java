package com.example.demo.persistence.repository;


import com.example.demo.persistence.entity.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CartRepository extends CrudRepository<Cart, Integer> {
    Optional<Cart> findById(Long id);

    void deleteById(Long id);
}
