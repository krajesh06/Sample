package com.constructor;

public class Student1 
{
    public String name;
    public int regno;
	public Student1(String name,int regno) 
	{
	 System.out.println("Constructor"+name);
	 this.regno = regno;
	 this.name = name;
	 
	}

}
