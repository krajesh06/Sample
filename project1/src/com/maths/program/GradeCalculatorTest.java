package com.maths.program;

public class GradeCalculatorTest 
{
	public static void main(String[] args) 
	{
		int percentage = 90;

		String grade = GradeCalculator.calculateGrade(percentage);
		System.out.println("Grade :" +grade );
	}
}
