package com.example.demo.controller;

import com.example.demo.persistence.entity.Category;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/")
    public List<Category> getAllCategory() {
        return categoryService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Category> getUserById(@PathVariable Long id) {
        return categoryService.findById(id);
    }

    @PostMapping("/")
    public Category createCategory(@RequestBody Category category) {
        return categoryService.save(category);
    }

    @PutMapping("/{id}")
    public Category updateUser(@PathVariable int id, @RequestBody Category category) {
        category.setId(id);
        return categoryService.save(category);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        categoryService.deleteById(id);
    }

}
