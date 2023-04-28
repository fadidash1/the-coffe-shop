package com.example.demo.persistence.service;


import com.example.demo.persistence.entity.User;
import com.example.demo.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public
class UserService {
@Autowired
private UserRepository userRepository;
    public User save(User user) {
    return userRepository.save(user);
    }
    public List<User> findAll(){
        return userRepository.findAll();
    }
    public User findById() {
        return userRepository.findById();
    }

    public User deleteById(int id) {
        return userRepository.deleteById();
    }
}
