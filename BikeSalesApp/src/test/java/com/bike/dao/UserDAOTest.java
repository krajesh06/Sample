package com.bike.dao;

import java.util.List;
import com.bike.Exception.DBException;
import com.bike.model.User;

public class UserDAOTest {

	public static void main(String[] args) throws DBException  {
		
		UserDAO userDAO = new UserDAOImpl();
		
		//testAddUser();
		List<User> userList =userDAO.findAll();
		
		for(User user : userList) {
			System.out.println(user);
		}
	}
	    public static void testAddUser() throws DBException{
		User user = new User();
		user.setCustomername("dhamo");
		user.setEmail("t@gmail.com");
		user.setPassword("pass12348");
		
		System.out.println(user);
		
		UserDAO userDAO = new UserDAOImpl();
		userDAO.register(user);
	}
}
