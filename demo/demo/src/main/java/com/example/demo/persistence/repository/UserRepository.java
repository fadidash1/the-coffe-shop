package com.example.demo.persistence.repository;

import com.example.demo.persistence.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findById(long id);

    List<User> findAll();

    User saveUser(User user);

    void deleteById(long id);
}
