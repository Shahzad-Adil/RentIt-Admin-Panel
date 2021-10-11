package com.rentit.entity;

import java.sql.Timestamp;


public class Payment {

	// define fields


	private int id;

	private Timestamp payment_time;

	
	private double bill;


	private String description;

	

	private Customer customer;

	

	private Trip trip;

	// define constructor

	public Payment() {

	}

	public Payment(Timestamp payment_time, double bill, String description) {
		super();
		this.payment_time = payment_time;
		this.bill = bill;
		this.description = description;
	}

	// define getter setter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getPayment_time() {
		return payment_time;
	}

	public void setPayment_time(Timestamp payment_time) {
		this.payment_time = payment_time;
	}

	public double getBill() {
		return bill;
	}

	public void setBill(double bill) {
		this.bill = bill;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Trip getTrip() {
		return trip;
	}

	public void setTrip(Trip trip) {
		this.trip = trip;
	}

	// define toString

	@Override
	public String toString() {
		return "Payment [id=" + id + ", payment_time=" + payment_time + ", bill=" + bill + ", description="
				+ description + ", customer=" + customer + ", trip=" + trip + "]";
	}

}
