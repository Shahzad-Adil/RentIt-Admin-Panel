package com.rentit.entity;
 


public class ContactPerson {

	
	private int id;
	
	private String name;
	
	
	private String email;
	
	private String cnic;
	
 	private String phone;
	
 	private String description;
 
	private Company company;

	
	//define constructors
	
	public ContactPerson() {
		
	}
	
	public ContactPerson(String name,  String email, String cnic, String phone, String description, Company company
			) {
		super();
		this.name = name;
		
		this.email = email;
		this.cnic = cnic;
		this.phone = phone;
		this.description = description;
		this.company = company;
	}



	//define Getters Setters
	
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

	public Company getCompany() {
		return company;
	}


	public void setCompany(Company company) {
		this.company = company;
	}



//	define toString
	


	@Override
	public String toString() {
		return "ContactPerson [id=" + id + ", name=" + name + ", email=" + email + ", cnic=" + cnic + ", phone="
				+ phone + ", description=" + description +  "]";
	}
	
	

	
}
