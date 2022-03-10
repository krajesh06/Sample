package com.maths.program;

public class Percentage {

	public static void main(String[] args) {
		// step1: input

		int mark1 = 90;
		int mark2 = 90;
		int mark3 = 100;

		// call
		int total = calculateTotal(mark1, mark2, mark3);
		int noOfSubject = 3;
		float percentage = calculatePercentage(total, noOfSubject);
	}

	public static int calculateTotal(int mark1, int mark2, int mark3) {
		int total = mark1 + mark2 + mark3;
		System.out.println("Total:" + total);
		return total;
	}

	public static float calculatePercentage(int total, int noOfSubject) {
		float percentage = ((float) total / noOfSubject);
		System.out.println("percentage :" + percentage);
		return percentage;
	}
}