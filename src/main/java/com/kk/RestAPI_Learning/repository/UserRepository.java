package com.kk.RestAPI_Learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kk.RestAPI_Learning.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    
}
