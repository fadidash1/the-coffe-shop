package com.example.demo.persistence.controller;

import com.example.demo.persistence.entity.UserType;
import com.example.demo.persistence.repository.UserTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user-types")
public class UserTypeController {

    @Autowired
    private UserTypeRepository userTypeRepository;

    @PostMapping
    public ResponseEntity<UserType> createUserType(@RequestBody UserType userType) {
        UserType savedUserType = userTypeRepository.save(userType);
        return new ResponseEntity<>(savedUserType, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserType> getUserTypeById(@PathVariable Long id) {
        Optional<UserType> userType = userTypeRepository.findById(id);
        return userType.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public List<UserType> getAllUserTypes() {
        return userTypeRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserTypeById(@PathVariable Long id) {
        userTypeRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
