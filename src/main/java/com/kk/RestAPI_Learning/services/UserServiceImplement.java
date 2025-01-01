package com.kk.RestAPI_Learning.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kk.RestAPI_Learning.entity.User;
import com.kk.RestAPI_Learning.repository.UserRepository;

@Service
public class UserServiceImplement implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImplement(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Integer id) {
        Optional<User> result = userRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        }else {
            throw new RuntimeException("User not found with id: " + id);
        }
    }

    @Override
    public String deleteById(Integer id) {
        Optional<User> result = userRepository.findById(id);
        if (result.isPresent()) {
            userRepository.deleteById(id);
            return "User deleted with id: " + id;
        }else {
            throw new RuntimeException("User not found with id: " + id);
        }
    }

}
