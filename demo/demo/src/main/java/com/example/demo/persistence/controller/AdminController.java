package com.example.demo.persistence.controller;

import com.example.demo.persistence.entity.Admin;
import com.example.demo.persistence.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AdminController {
    @Autowired
    private AdminRepository adminRepository;

    @GetMapping("/admin")
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }
}
