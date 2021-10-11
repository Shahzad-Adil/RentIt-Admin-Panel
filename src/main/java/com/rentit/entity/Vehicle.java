package com.rentit.entity;

public class Vehicle {

	
		private int id;
		
		private String v_reg_no;
		
		private String modelNumber;
		
		private String category;
		
		private boolean status;
		
		
		private String v_make;
		
		private String v_description;
		

		private Company company;
		

		private Terminal terminal;
		
		int terminalId;
		
	
		
		public Vehicle() {
			
		}



		public Vehicle(String v_reg_no, String modelNumber, String category, boolean status,
				String v_make, String v_description, Company company, Terminal terminal) {
			super();
			this.v_reg_no = v_reg_no;
			this.modelNumber = modelNumber;
			this.category = category;
			this.status = status;
			this.v_make = v_make;
			this.v_description = v_description;
			this.company = company;
			this.terminal = terminal;
		}



		public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}



		public String getV_reg_no() {
			return v_reg_no;
		}



		public void setV_reg_no(String v_reg_no) {
			this.v_reg_no = v_reg_no;
		}



		public int getTerminalId() {
			return terminalId;
		}



		public void setTerminalId(int terminalId) {
			this.terminalId = terminalId;
		}



		public String getModelNumber() {
			return modelNumber;
		}



		public void setModelNumber(String modelNumber) {
			this.modelNumber = modelNumber;
		}



		public String getCategory() {
			return category;
		}



		public void setCategory(String category) {
			this.category = category;
		}



		public boolean isStatus() {
			return status;
		}



		public void setStatus(boolean status) {
			this.status = status;
		}


		public String getV_make() {
			return v_make;
		}



		public void setV_make(String v_make) {
			this.v_make = v_make;
		}



		public String getV_description() {
			return v_description;
		}



		public void setV_description(String v_description) {
			this.v_description = v_description;
		}



		public Company getCompany() {
			return company;
		}



		public void setCompany(Company company) {
			this.company = company;
		}



		public Terminal getTerminal() {
			return terminal;
		}



		public void setTerminal(Terminal terminal) {
			this.terminal = terminal;
		}



		@Override
		public String toString() {
			return "Vehicle [id=" + id + ", v_reg_no=" + v_reg_no + ", modelNumber=" + modelNumber + ", category="
					+ category + ", status=" + status + ", v_make=" + v_make + ", v_description=" + v_description
					+ ", company=" + company + ", terminal=" + terminal + "]";
		}	
}
