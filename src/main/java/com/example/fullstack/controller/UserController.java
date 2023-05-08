package com.example.fullstack.controller;

import com.example.fullstack.model.User;
import com.example.fullstack.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser){
        return userRepo.save(newUser);
    }

    @GetMapping("/users")
    List<User> getAllUsers(){
        return userRepo.findAll();
    }


}
