package com.kk.RestAPI_Learning.services;

import java.util.List;

import com.kk.RestAPI_Learning.entity.User;

public interface UserService {
    User save(User user);
    List<User> findAll();
    User findById(Integer id);
    String deleteById(Integer id);
    User updateByIdUser(User user);
}
