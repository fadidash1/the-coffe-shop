package com.example.demo.persistence.controller;

import com.example.demo.persistence.entity.Client;
import com.example.demo.persistence.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/")
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    // other endpoints for client management
}