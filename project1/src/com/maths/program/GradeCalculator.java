package com.maths.program;

public class GradeCalculator 
{

	// calculate Grade : Above 90-100("Grade A"), 80-89("Grade B"),60-79(Grade
	// c),Below
	// 60(Grade F)

	public static String calculateGrade(int percentage) 
	{

		String grade = null;

		// logic
		if (percentage >= 90 && percentage < 100) {
			grade = "A";
		} else if (percentage >= 80 && percentage <= 89) {
			grade = "B";
		} else if (percentage >= 60 && percentage <= 79) {
			grade = "C";
		} else if (percentage >= 0 && percentage <= 59) {
			grade = "F";
		}
		return grade;

	}
}