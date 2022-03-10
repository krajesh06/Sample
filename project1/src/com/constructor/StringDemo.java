package com.constructor;

public class StringDemo {
	static String validEmailExtensions = "gmail.com";

	public static void main(String[] args) {
		String email = "admin@gmail.com";
		String password = "pass123";
		//System.out.println(email.endsWith(validEmailExtensions));
		
			if ("admin@gmail.com".equalsIgnoreCase(email)&& "pass123".equals(password))
			{
				System.out.println("valid login info");
				
			}
			else 
			{
				System.out.println("invalid login info");
			}
		}

	}


