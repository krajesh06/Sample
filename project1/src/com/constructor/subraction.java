package com.constructor;

public class subraction {
       public int firstnumber;
       public int secondnumber;
	
	public subraction(int a , int b) {
		this.firstnumber = a;
		this.secondnumber = b;
		//avoid typing logics in constructor
	}
	public int add() {
		return this.firstnumber - this.secondnumber;
	}

	public static void main(String[] args) {
		subraction sub = new subraction(50,20);
		int result = sub.add();
		System.out.println("result: "+result);
	
	}

}
