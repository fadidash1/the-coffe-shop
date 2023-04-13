package com.example.demo.persistence.repository;

import com.example.demo.persistence.entity.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
