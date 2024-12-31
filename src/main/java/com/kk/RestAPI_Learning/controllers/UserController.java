package com.kk.RestAPI_Learning.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/users")
    public String getUsers() {
        return "Show All users";
    }

    @GetMapping("/about")
    public String getAbout(){
        return "About Us";
    }

    @GetMapping("/address")
    public String getAddress(){
        return "Suphanburi, Thailand";
    }

    @GetMapping("/job")
    public String getJob(){
        return "Student";
    }
}
