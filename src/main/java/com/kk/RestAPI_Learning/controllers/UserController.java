package com.kk.RestAPI_Learning.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kk.RestAPI_Learning.entity.User;
import com.kk.RestAPI_Learning.services.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    @PostMapping("/users")
    public User addUser(@RequestBody User user) {
        user.setId(0);
        return userService.save(user);
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable("id") Integer id) {
        return userService.findById(id);
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable("id") Integer id) {
        return userService.deleteById(id);
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user) {
        return userService.save(user);
    }
}
