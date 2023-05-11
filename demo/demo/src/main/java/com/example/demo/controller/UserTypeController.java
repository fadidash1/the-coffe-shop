package com.example.demo.controller;
import com.example.demo.persistence.entity.UserType;
import com.example.demo.persistence.repository.UserTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user-types")
public class UserTypeController {

    @Autowired
    private UserTypeRepository userTypeRepository;

    @GetMapping("/")
    public List<UserType> getAllUserTypes() {
        return userTypeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<UserType> getUserTypeById(@PathVariable int id) {
        return userTypeRepository.findById((long) id);
    }

    @PostMapping("/")
    public UserType createUserType(@RequestBody UserType userType) {
        return userTypeRepository.save(userType);
    }

    @PutMapping("/{id}")
    public UserType updateUserType(@PathVariable int id, @RequestBody UserType userType) {
        userType.setId(id);
        return userTypeRepository.save(userType);
    }
    @DeleteMapping("/{id}")
    public void deleteUserType(@PathVariable int id) {
        userTypeRepository.deleteById((long) id);
    }
}