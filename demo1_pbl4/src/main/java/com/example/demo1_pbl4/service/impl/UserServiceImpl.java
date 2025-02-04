package com.example.demo1_pbl4.service.impl;

import com.example.demo1_pbl4.model.User;
import com.example.demo1_pbl4.repository.UserRepository;
import com.example.demo1_pbl4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long userId) {
        return userRepository.findById(userId).get();
    }

    public User insertUser(User user) {
        return userRepository.save(user);
    }

    public void updateUser(User user) {
        userRepository.save(user);
    }

    public boolean deleteUser(Long userId) {
        userRepository.deleteById(userId);
        return false;
    }
}
