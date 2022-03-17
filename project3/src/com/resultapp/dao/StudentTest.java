package com.resultapp.dao;

	import com.resultapp.dao.StudentDAO;

	public class StudentTest {

		public static void main(String[] args) throws Exception{
			
			//Student Details - 1
			Student s1 =  new Student("Ajay");
			System.out.println(s1.name + "-" + s1.regNo);
			
			StudentDAO studentDAO = new StudentDAO();
			studentDAO.addStudent(s1);
			
		}
	}

