package com.bike.validator;

import com.bike.model.User;

public class UserValidatorTest {

	public static void main(String[] args) throws Exception {
		
		User user = new User();
		user.setCustomername("rajesh");
		user.setEmail("k@gmail.com");
		user.setPassword("pass12348");
		
		System.out.println(user);
		UserValidator.validateUserDetails(user);
		

	}

}
