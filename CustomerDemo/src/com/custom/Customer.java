package com.custom;

public class Customer {

	private int id;
	private String nameString;
	private String email;
	private String phone;
	private String usernamem;
	private String password;
	
	
	public Customer(int id, String nameString, String email, String phone, String usernamem, String password) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.email = email;
		this.phone = phone;
		this.usernamem = usernamem;
		this.password = password;
	}


	public int getId() {
		return id;
	}



	public String getNameString() {
		return nameString;
	}



	public String getEmail() {
		return email;
	}



	public String getPhone() {
		return phone;
	}


	public String getUsernamem() {
		return usernamem;
	}


	public String getPassword() {
		return password;
	}


	
	
	
}
