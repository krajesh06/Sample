package com.bike.dao;

import com.bike.Exception.DBException;

import com.bike.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;




public class UserDAOImpl implements UserDAO {

	public void register(User user)throws DBException {
		Connection connection=null;
		PreparedStatement statement=null;
		try {
		Class.forName("com.sql.cj.jdbc.Driver");
		String url="jdbc:mysql://101.53.133.59:3306/revature_training_db";
		String username="rev_user";
		String password="rev_user";
	   connection=DriverManager.getConnection(url,username,password);
		
		String sql="INSERT INTO userid (customername,email,PASSWORD) VALUES (?,?,?)";
		statement = connection.prepareStatement(sql);
		statement.setString(1, user.getCustomername());
		statement.setString(2, user.getEmail());
		statement.setString(3, user.getPassword());
		
		int rows = statement.executeUpdate();
		System.out.println("No.of.rows inserted: "+rows);
		}
		catch(SQLException e) {
			e.printStackTrace();
			throw new DBException(e.getMessage(),e);
		}
		catch(ClassNotFoundException e) {
			
		}
		finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	} 
public List<User> findAll()throws DBException{
	List<User> userList = new ArrayList<User>();
	Connection connection = null;
	PreparedStatement statement = null;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://101.53.133.59:3306/revature_training_db";
		String username = "rev_user";
		String password = "rev_user";
		connection = DriverManager.getConnection(url,username,password);
		String sql="SELECT id,customername,email,PASSWORD FROM userid";
		statement = connection.prepareStatement(sql);
		ResultSet rs = statement.executeQuery();
		while (rs.next()) {
			String Customername=rs.getString("customername");
			String Email=rs.getString("email");
			String Password=rs.getString("password");
			
			User user = new User();
			user.setCustomername(Customername);
			user.setEmail(Email);
			user.setPassword(Password);
			
			userList.add(user);
		}
	}
		catch(SQLException e) {
			e.printStackTrace();
			throw new DBException(e.getMessage(),e);
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				statement.close();
				connection.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return userList;
	}
}


	


