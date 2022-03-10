package com.constructor;

public class StringExample {

	public static void main(String[] args) {
		
		String name ="rajesh";
		
		System.out.println("name");
		System.out.println(name.length()); //to find the length
		System.out.println(name.toLowerCase()); //to transform to lowercase
		System.out.println(name.toUpperCase()); //to transform to uppercase
		System.out.println(name.contains("esh")); //checks whether it is present
		System.out.println(name.startsWith("r")); //whether the word starts with
		System.out.println(name.endsWith("h")); //whether it ends with
		System.out.println(name.indexOf("r")); //the index begins with
		System.out.println(name.substring(0,3)); // it gives the string within the 
		System.out.println(name.isEmpty()); //its says whether it is empty
		System.out.println("  rajesh  ".trim());// it trims the space front and end but not in the middle of name
        System.out.println("rajesh".equals("rajesh"));
        System.out.println("rajesh".equalsIgnoreCase("Rajesh"));
	}
	

}
