/*
        package com.example.demo.persistence.login;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Login {
    private static final Map<String, String> users = new HashMap<>();
    static {
        users.put("johndoe", "password");
        users.put("janedoe", "letmein");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        if (users.containsKey(username) && users.get(username).equals(password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
*/