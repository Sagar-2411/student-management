package com.bikkadIt.CrudRepositoryMethod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.bikkadIt.CrudRepositoryMethod.controller.UserController;
import com.bikkadIt.CrudRepositoryMethod.model.User;

@SpringBootApplication
public class CrudRepositoryMethodApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CrudRepositoryMethodApplication.class, args);
		UserController controller = context.getBean(UserController.class);
		
		User user= new User();
		
		user.setUsername("sagar");
		user.setUserAddress("nashik");
		user.setAge(30);
		user.setUserEmail("sagarraut332@");
		
		controller.saveUser(user);
				
				
				
				
				
				
				
	}

}

