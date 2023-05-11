package com.example.demo.service;

import com.example.demo.persistence.entity.Category;
import com.example.demo.exception.CategoryNotFoundException;
import com.example.demo.persistence.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service


public
class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public Category save(Category category) {
        return categoryRepository.save(category);
    }
    public List<Category> findAll(){
        return categoryRepository.findAll();
    }
    public Optional<Category> findById(Long id) {
        Optional<Category> optionalCategory = categoryRepository.findById(id);
        if (!optionalCategory.isPresent()){
            throw new CategoryNotFoundException("Category not found with id: " + id);
        }
        return optionalCategory;
    }
    public void deleteById(Long id){
        Optional<Category> optionalCategory = categoryRepository.findById(id);
        if (!optionalCategory.isPresent()){
            throw new CategoryNotFoundException("Category not found with id: " + id);
        }
        categoryRepository.deleteById(id);
    }

}
