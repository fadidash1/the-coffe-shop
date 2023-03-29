package com.example.demo.persistence.repository;

import com.example.demo.persistence.entity.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTypeRepository extends JpaRepository<UserType, Long> {

}
