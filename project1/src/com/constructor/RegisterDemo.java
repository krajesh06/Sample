package com.constructor;

public class RegisterDemo {

	public static void main(String[] args) {
		String name = "rajesh"; //valid
	    //String name="";//invalid
		//String name=" ";//invalid
		//name must contain at least 1 character
		//output: valid name
		//output: Name cannot be blank/empty
        
        //password must be minimum of 8 characters
        if(name.isEmpty() || name.isBlank()) {
			System.out.println("Name cannot be blank/empty");
		}
		else {
			System.out.println("Valid Name");
		}
       String password = "pass1234567";
		
		//Scenario: Password must be minimum 8 characters
		if( password.length() < 8) {
			System.out.println("Password must be minimum 8 characters");
		}
		else {
			System.out.println("Valid Password");
		}
        
	}

}
