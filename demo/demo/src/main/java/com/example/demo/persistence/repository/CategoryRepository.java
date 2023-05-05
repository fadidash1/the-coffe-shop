package com.example.demo.persistence.repository;

import com.example.demo.persistence.entity.Category;
import com.example.demo.persistence.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    List<Category> findAll();
    Optional<Category> findById(Long id);
    void deleteById(Long id);
}
