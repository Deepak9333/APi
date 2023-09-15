package com.basic.service.impl;

import com.basic.repository.UserRepository;
import com.basic.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User createData(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllData() {
        return userRepository.findAll();
    }

    @Override
    public User byIdData(Long Id) {
        return userRepository.findById(Id).orElseThrow(()->new RuntimeException("Id not found"));
    }
}
