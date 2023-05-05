package com.example.demo.persistence.repository;

import com.example.demo.persistence.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findAll();
    Optional<Product> findById(Long id);

    void deleteById(Long id);
}
