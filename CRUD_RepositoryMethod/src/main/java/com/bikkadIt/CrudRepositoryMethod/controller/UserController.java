package com.bikkadIt.CrudRepositoryMethod.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bikkadIt.CrudRepositoryMethod.model.User;
import com.bikkadIt.CrudRepositoryMethod.service.UserServiceI;
@Controller
public class UserController {
@Autowired
	private UserServiceI  userServiceI; 

public User saveUser(User user) {
	User user1 = userServiceI.saveUserService(user);
	return user1;
	
}
}

