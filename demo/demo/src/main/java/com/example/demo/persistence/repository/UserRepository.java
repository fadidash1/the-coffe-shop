package com.example.demo.persistence.repository;

import com.example.demo.persistence.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findById(long id);

    List<User> findAll();

    User save(User user);

    void deleteById(long id);
}
