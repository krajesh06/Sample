package com.constructor;

public class Student {
	public Student() {
		System.out.println("constructor");
	}

	public void student() {
		System.out.println("Method");
	}

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println("completed");
		student.student();
	}
}
