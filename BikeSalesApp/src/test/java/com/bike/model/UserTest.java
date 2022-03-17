package com.bike.model;

public class UserTest {

	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setCustomername("rajesh");
		user.setEmail("k@gmail.com");
		user.setPassword("pass1234");
		
		System.out.println(user);

	}

}
