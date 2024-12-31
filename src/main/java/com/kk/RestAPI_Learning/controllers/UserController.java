package com.kk.RestAPI_Learning.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kk.RestAPI_Learning.entity.User;

@RestController
@RequestMapping("/api")
public class UserController {
    @GetMapping("/users")
    public List<User> getUsers() {
        List<User> data = new ArrayList<>();
        data.add(new User(1,"K","K"));
        data.add(new User(2,"Oh","No"));
        return data;
}
}
