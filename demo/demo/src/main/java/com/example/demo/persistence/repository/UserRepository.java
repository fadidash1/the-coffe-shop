package com.example.demo.persistence.repository;

import com.example.demo.persistence.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findById(long id);

    List<User> findAll();
    Optional<Object> findByUsername(String username);

    Optional<Object> findByEmail(String email);

    User findById();

    User deleteById();
}
