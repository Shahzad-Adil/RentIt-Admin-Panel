package com.rentit.entity;

public class Admin {


	private int id;
	
	private String fullName;
	
	private String userName;
	
	private String password;
	
	private String email;
	
	private String cnic;
	
	private String phone;
	
	private String description;


	//define constructors
	
	public Admin() {
		
	}
	



	
	public Admin( String fullName, String userName, String password, String email, String cnic, String phone,
			String description) {
		super();
//		this.id = id;
		this.fullName = fullName;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.cnic = cnic;
		this.phone = phone;
		this.description = description;
	}





	//define getters/setters

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
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


	
	//define toString

	@Override
	public String toString() {
		return "Admin [id=" + id + ", fullName=" + fullName + ", userName=" + userName + ", password=" + password
				+ ", email=" + email + ", cnic=" + cnic + ", phone=" + phone + ", description=" + description + "]";
	}
}
