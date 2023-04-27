package com.example.demo.persistence.controller;


import com.example.demo.persistence.entity.User;
import com.example.demo.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public List<User> getAllUsers() {
        return UserRepository.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        return UserRepository.findById(id);
    }

    @PostMapping("/")
    public User createUser(@RequestBody User user) {
        return UserRepository.save(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User user) {
        user.setId(id);
        return UserRepository.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        userRepository.deleteById(id);
    }
}