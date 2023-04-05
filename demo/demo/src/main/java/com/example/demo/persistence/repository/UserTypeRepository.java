package com.example.demo.persistence.repository;

import com.example.demo.persistence.entity.User;
import com.example.demo.persistence.entity.UserType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserTypeRepository extends CrudRepository<UserType, Long> {
 List<UserType> findAll();

}
