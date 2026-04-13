package com.shopsphere.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopsphere.entity.User;
import com.shopsphere.service.UserService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        userService.registerUser(user);
        return "User Registered Successfully!";
    }
    @GetMapping("/viewAllUsers")  // request method 
	public List<User> ViewUsersByID(){
		return userService.ViewAllUsers();
	}
    
    @GetMapping("/view/{id}")
    public Optional<User> viewUser(@PathVariable Integer id) {
    	//if(id==null) {System.out.println("ID IS NULL"); return null ;}
    	return userService.viewById(id);
    }

}