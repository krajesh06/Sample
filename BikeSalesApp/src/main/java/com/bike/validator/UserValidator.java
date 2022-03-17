package com.bike.validator;

import com.bike.model.User;

public class UserValidator {

	public static void validateUserDetails(User user) throws Exception {
		
		if (user.getCustomername() == null) {
			throw new Exception("Invalid Name");
		}
		else if(user.getEmail()==null) {
			throw new Exception("Invalid email");
		}
		else if(user.getPassword()==null) {
			throw new Exception("Invalid password");
		}
		else if(user.getPassword().length() <=8) {
			System.out.println("password must be minimum 8 characters ");
		}
		System.out.println("Validation Success");
	}

}
