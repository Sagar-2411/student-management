package com.bikkadIt.CrudRepositoryMethod.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikkadIt.CrudRepositoryMethod.Repository.UserRepository;
import com.bikkadIt.CrudRepositoryMethod.model.User;
@Service
public interface UserServiceI  {
	
	public User saveUserService(User user);
	

	}
