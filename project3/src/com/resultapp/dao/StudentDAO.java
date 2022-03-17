package com.resultapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;	
	


public class StudentDAO {

	public void addStudent(Student student) throws Exception{

		//Step 1 : Database Driver ( Optional) 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2: Get the Connection
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		System.out.println(connection);
		
		//insert into students(name) values ('Naresh')
		String query = "insert into stud(name) values ('" + student.name + "')" ;
		System.out.println(query);
		
		Statement statement = connection.createStatement();
		int rows = statement.executeUpdate(query);
		System.out.println("No of rows inserted:" + rows);
		
		
	}
	
	public void updateStudent(Student student) throws Exception{

		//Step 1 : Database Driver ( Optional)
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2: Get the Connection
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		System.out.println(connection);
		
		//update students set name ='Naresh Kumar' where reg_no =1
		String query = "update stud set name = '" + student.name 
				+ "' where reg_no = " + student.regNo ; 
		System.out.println(query);
		
		Statement statement = connection.createStatement();
		int rows = statement.executeUpdate(query);
		System.out.println("No of rows updated:" + rows);
		
		
	}
	
	public void deleteStudent(int regNo) throws Exception{

		//Step 1 : Database Driver ( Optional)
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2: Get the Connection
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		System.out.println(connection);
		
		//delete from students where reg_no = 1
		String query = "delete from stud where reg_no = " + regNo ;
		System.out.println(query);
		
		Statement statement = connection.createStatement();
		int rows = statement.executeUpdate(query);
		System.out.println("No of rows deleted:" + rows);
		
		
	}
	
}