package com.maths.program;

public class AdditionTest 
{
	public static void  main(String[] args) 
	{
		int a = 10;
		int b = 20;
		Addition additionObj = new Addition();		
		int result = additionObj.add(a, b);
		System.out.println("Result: " + result);
	}
}
