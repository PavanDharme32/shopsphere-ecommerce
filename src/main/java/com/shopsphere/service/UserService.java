package com.shopsphere.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.shopsphere.entity.User;
import com.shopsphere.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public User registerUser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        user.setRole("ROLE_USER");
        return userRepository.save(user);
    }
    public List<User> ViewAllUsers(){
    	return userRepository.findAll();  // it gives the list of all users.
    }
    
    public Optional<User> viewById(Integer id) {
    	return userRepository.findById(id);
    }
}