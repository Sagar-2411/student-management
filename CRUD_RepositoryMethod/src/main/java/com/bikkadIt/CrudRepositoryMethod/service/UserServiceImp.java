package com.bikkadIt.CrudRepositoryMethod.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikkadIt.CrudRepositoryMethod.Repository.UserRepository;
import com.bikkadIt.CrudRepositoryMethod.model.User;
@Service
public class UserServiceImp implements UserServiceI {

	@Autowired
	private UserRepository userRepository;
	
	public User saveUserService(User user) {
		User user1 = userRepository.save(user);
		return user1;
		
		
	}

}
