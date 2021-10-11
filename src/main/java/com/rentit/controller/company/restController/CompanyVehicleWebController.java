package com.rentit.controller.company.restController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.rentit.entity.Company;
import com.rentit.entity.Terminal;
import com.rentit.entity.Vehicle;
import com.rentit.login.WelcomeController;

@RestController
public class CompanyVehicleWebController
{
	
	 @Autowired
	 static RestTemplate restTemplate = new RestTemplate();	 
	 
	 
	 WelcomeController wc=new WelcomeController();
	 
	



	 //Get List of Feedbacks
	public List<Vehicle> getAllVehicles() 
	
	{
		  HttpHeaders headers = new HttpHeaders();

	      headers.setContentType(MediaType.APPLICATION_JSON);
	      
	      HttpEntity <Object> entity = new HttpEntity<>(headers);
	
	      ResponseEntity<List<Vehicle>> result =  restTemplate.exchange("http://localhost:7070/api/vehicles",
				  HttpMethod.GET, entity,  new ParameterizedTypeReference<List<Vehicle>>() {} );

		 
		 List<Vehicle> list = result.getBody();
		    		 
		 return list; 
	}
	

	
	public List<Vehicle> getAllCompVehicles() 
	{
		 List<Vehicle> list=getAllVehicles();
		 Company comp=wc.getLoggedInUser();
		 
		 List<Vehicle> filteredList=new ArrayList<Vehicle>();
		 
		 for(Vehicle veh: list)
		 {
			 if(veh.getCompany().getId()==comp.getId())
				 filteredList.add(veh);
		 }
		 
		
		return filteredList;	
	}

	
	
	
	
	public void addVehicle(String v_reg_no, String modelNumber, String category, boolean status, 
			String v_make, String v_description, Company company, Terminal terminal) 
	{
		
		Vehicle vehicle=new Vehicle(v_reg_no, modelNumber, category, status,
				v_make, v_description, company, terminal);
		
		  restTemplate.postForEntity("http://localhost:7070/api/vehicles" 
				  , vehicle, Vehicle.class);
		
	}

	
	public Terminal retreiveTerminalById(int id)
	{
		  HttpHeaders headers = new HttpHeaders();

	      headers.setContentType(MediaType.APPLICATION_JSON);
	      
	      HttpEntity <Object> entity = new HttpEntity<>(headers);
	
	      ResponseEntity<Terminal> result =  restTemplate.exchange("http://localhost:7070/api/terminals/"+id,
				  HttpMethod.GET, entity,  Terminal.class );
	      
	      Terminal terminal = result.getBody();
	      
	      return terminal;

	}
	
	
	
	
	
	public Vehicle retreiveVehicleById(int id) 
	{
		HttpHeaders headers = new HttpHeaders();

	      headers.setContentType(MediaType.APPLICATION_JSON);
	      
	      HttpEntity <Object> entity = new HttpEntity<>(headers);
	
	      ResponseEntity<Vehicle> result =  restTemplate.exchange("http://localhost:7070/api/vehicles/"+id,
				  HttpMethod.GET, entity,  Vehicle.class );
	      
	     Vehicle vehicle = result.getBody();
	      
	      return vehicle;
	}



	public Terminal retreiveTerminalById() {
		 HttpHeaders headers = new HttpHeaders();

	      headers.setContentType(MediaType.APPLICATION_JSON);
	      
	      HttpEntity <Object> entity = new HttpEntity<>(headers);
	
	      ResponseEntity <List<Terminal>> result =  restTemplate.exchange("http://localhost:7070/api/terminals",
				  HttpMethod.GET, entity, new ParameterizedTypeReference<List<Terminal>>() {} );
	      
	      List<Terminal> terminal =  result.getBody();
	      
	      return terminal.get(0);
	}
 
	
	//Delete a feedback

	
	
	

}
