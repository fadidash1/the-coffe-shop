package com.example.demo.persistence.service;

import com.example.demo.persistence.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service


public
class CategoryService {
    @Autowired
    private CategoryService categoryService;

    public Category save(Category category) {
        return categoryService.save(category);
    }
    public List<Category> findAll(){
        return categoryService.findAll();
    }
    public Optional<Category> findById(Long id) {
        return categoryService.findById(id);
    }
    public void deleteById(Long id){
        categoryService.deleteById(id);
    }

}
