package com.rentit.entity;


public class Company {

	private int id;
	
	private String name;
	private String password;
	
	private String description;
	
	public Company() {
		
	}

	public Company(String name, String description, String password) {
		super();
		this.name = name;
		this.password=password;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return String.format("Company [id=%s, name=%s, description=%s]", id, name, description);
	}

	
	
	
}
