package com.rentit.entity;


public class Customer {

	private int id;
	
	private String name;
	
	private String userName;
	
	private String password;
	
	private String email;
	
	private String cnic;
	
	private String phone;
	
	private String description;

	
//define constructor
	
	public Customer() {
		
	}

	
	public Customer(String name, String userName, String password, String email, String cnic, String phone,
			String description) {
		super();
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.cnic = cnic;
		this.phone = phone;
		this.description = description;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCnic() {
		return cnic;
	}


	public void setCnic(String cnic) {
		this.cnic = cnic;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return String.format(
				"Customer [id=%s, name=%s, userName=%s, password=%s, email=%s, cnic=%s, phone=%s, description=%s]", id,
				name, userName, password, email, cnic, phone, description);
	}
		
	
}




