package com.SpringSecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringSecurity.entities.User;
import com.SpringSecurity.service.UserService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private UserService userService;
	//get all user
	@GetMapping("/")
	public List<User> getAllUsers() {

		return this.userService.getAllUser();
	}
	@GetMapping("/login")
	public String login() {
		return "This is login page of Admin";
	}

	@RequestMapping("/protected")
	public String protectedHello() {
		return "Hello , I am protected";
	}
	// got to admin page
	@GetMapping("/homepage")
	public String Homepage() {
		return "You are in admin Portal";
	}

}
