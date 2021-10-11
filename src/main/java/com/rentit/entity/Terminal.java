package com.rentit.entity;

public class Terminal {

	
	private int id;
	
	private String name;
	
	private String description;
	
	private double longitude;
	
	private double latitude;
	

	public Terminal() {
		
	}
	public Terminal(String name, String description, double longitude, double latitude) {
		
		super();
		this.name = name;
		this.description = description;
		this.latitude=latitude;
		this.longitude=longitude;
		
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	@Override
	public String toString() {
		return "Terminal [id=" + id + ", name=" + name + ", description=" + description + ", longitude=" + longitude
				+ ", latitude=" + latitude + "]";
	}

	
	
	
}




