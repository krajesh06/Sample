package com.bike.model;

public class User {

	private Integer id;

	private String customername;

	private String email;

	private String password;

	public static void main(String[] args) {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public String getEmail() {
	return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}


@Override
public String toString() {
   return "User [id=" + id +", customername=" + customername +",email=" + email+",password=" +password+"]"; 
}
}
