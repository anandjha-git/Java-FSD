package com.SpringSecurity.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringSecurity.entities.User;

@Service
public class UserService {
	List <User> list=new ArrayList<>();

	public UserService() {
		list.add(new User(1,"anand1@admin","admin@123","Admin"));
		list.add(new User(2,"anand@user","user@123","User"));
		list.add(new User(3,"akshay@user","aksh@123","User"));
	}
	
	
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return this.list;
	}

	
}
