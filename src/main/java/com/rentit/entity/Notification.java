package com.rentit.entity;

public class Notification {


	private int id;
	
	private String token;
	
	private String email;
	
	


	//define constructors
	
	public Notification() {
		
	}
	



	






	public Notification(int id, String token, String email) {
		super();
		this.id = id;
		this.token = token;
		this.email = email;
	}











	public int getId() {
		return id;
	}











	public void setId(int id) {
		this.id = id;
	}











	public String getToken() {
		return token;
	}











	public void setToken(String token) {
		this.token = token;
	}











	public String getEmail() {
		return email;
	}











	public void setEmail(String email) {
		this.email = email;
	}











	@Override
	public String toString() {
		return "Notification [id=" + id + ", token=" + token + ", email=" + email + "]";
	}


	//define getters/setters


}
