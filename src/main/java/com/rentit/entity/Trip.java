package com.rentit.entity;

public class Trip {

	private int id;

	private String trip_date;

	private String start_time;

	
	private String end_time;

	
	private double reading_at_start;

	
	private double reading_at_end;

	private boolean optionDriver;
	
	private String description;
	
	private String status;

	
	private Vehicle vehicle;

	private Driver driver;

	private Customer customer;
	
	private Terminal terminal;


	private Payment payment;

	// define constructor

	public Trip() {

	}

	public Trip(String trip_date, String start_time, String end_time, double reading_at_start, double reading_at_end, String status,
			String description, boolean optionDriver) {
		super();
		this.trip_date = trip_date;
		this.status=status;
		this.start_time = start_time;
		this.end_time = end_time;
		this.reading_at_start = reading_at_start;
		this.reading_at_end = reading_at_end;
		this.description = description;
		this.optionDriver = optionDriver;
		
		
	}

	// define getter setter

	public int getId() {
		return id;
	}

	public boolean isOptionDriver() {
		return optionDriver;
	}

	public void setOptionDriver(boolean optionDriver) {
		this.optionDriver = optionDriver;
	}

	public Payment getPayment() {
		return payment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTrip_date() {
		return trip_date;
	}

	public void setTrip_date(String trip_date) {
		this.trip_date = trip_date;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public double getReading_at_start() {
		return reading_at_start;
	}

	public void setReading_at_start(double reading_at_start) {
		this.reading_at_start = reading_at_start;
	}

	public double getReading_at_end() {
		return reading_at_end;
	}

	public void setReading_at_end(double reading_at_end) {
		this.reading_at_end = reading_at_end;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Terminal getTerminal() {
		return terminal;
	}

	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}

	@Override
	public String toString() {
		return "Trip [id=" + id + ", trip_date=" + trip_date + ", start_time=" + start_time + ", end_time=" + end_time
				+ ", reading_at_start=" + reading_at_start + ", reading_at_end=" + reading_at_end + ", description="
				+ description + ", status=" + status + ", vehicle=" + vehicle + ", driver=" + driver + ", customer="
				+ customer + ", payment=" + payment + ", terminal=" + terminal + "]";
	}

	// define toString



}
