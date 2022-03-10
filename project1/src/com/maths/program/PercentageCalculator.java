package com.maths.program;

public class PercentageCalculator 
{
	//method signature => method name, arguments , return type
    //arguments : string[] args
	//return type:void
	public static void main(String[] args) 
	{
	
	//step1: input
	int mark1 = 80;
	int mark2 = 90;
	int mark3 = 80;
	
	//step2: Business logic
	int total; //variable declaration
	int percentage = 0; // assigning value to a variable using "=".
	
	//step3: implement logic
	total = mark1 + mark2 + mark3;
	percentage = total/3;
	
	//step4: output
	System.out.println("Total:" + total + ", percentage:" + percentage);
     }
}
