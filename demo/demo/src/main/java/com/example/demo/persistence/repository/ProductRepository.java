package com.example.demo.persistence.repository;

import com.example.demo.persistence.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
     static List<Product> findAllByCategoryProducts(){

         return null;
     }


}
