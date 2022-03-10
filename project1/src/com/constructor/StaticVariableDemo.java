package com.constructor;

public class StaticVariableDemo  {
	public static int a = 0; // Global copy of variable value
	public int b = 0;// Each object will have its own copy of the variable value
	public int c; // default value is zero for the instance variable

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// syntax : classname obj = new classname();
		StaticVariableDemo obj1 = new StaticVariableDemo();// static Variable/:a=0,instance variable b=o
		obj1.a++; // a=0 to a=1 //update to global copy of the variable
		obj1.b++; // b=0 to b=1 //update to instance copy of the variable
		System.out.println("a=" + obj1.a + ",b=" + obj1.a++);

		StaticVariableDemo obj2 = new StaticVariableDemo();
		obj2.a++;
		obj2.b++;
		System.out.println("a=" + obj2.a + ",b=" + obj2.b);

		StaticVariableDemo obj3 = new StaticVariableDemo();
		System.out.println("a=" + obj3.a + ",b=" + obj3.b + ",c=" + obj3.c);
		
		int result = 0;
		System.out.println(result);
	}

}
