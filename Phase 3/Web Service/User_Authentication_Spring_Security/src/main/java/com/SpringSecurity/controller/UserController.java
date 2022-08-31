package com.SpringSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	@GetMapping("/home")
	public String home() {
		return "This is user portal";
	}

	@GetMapping("/login")
	public String login() {
		return "This is login page of user";
	}

}
