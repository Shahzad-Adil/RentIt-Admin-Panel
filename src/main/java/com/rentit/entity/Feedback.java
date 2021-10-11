package com.rentit.entity;

public class Feedback {

	
	private int id;
	
	private String description;
	
	private double rating;
	

	private Customer customer;
	

	private Vehicle vehicle;
	
	
	//define constructor

	public Feedback() {
		
	}


	public Feedback(String description, double rating, Customer customer, Vehicle vehicle) {
		super();
		this.description = description;
		this.rating = rating;
		this.customer = customer;
		this.vehicle = vehicle;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Vehicle getVehicle() {
		return vehicle;
	}


	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}


	@Override
	public String toString() {
		return String.format("Feedback [id=%s, description=%s, rating=%s, customer=%s, vehicle=%s]", id, description,
				rating, customer, vehicle);
	}
	

	
}
