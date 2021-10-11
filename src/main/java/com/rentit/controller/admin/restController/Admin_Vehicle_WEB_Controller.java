package com.rentit.controller.admin.restController;

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

import com.rentit.entity.Terminal;
import com.rentit.entity.Vehicle;

@RestController
public class Admin_Vehicle_WEB_Controller
{
	
	 @Autowired
	 static RestTemplate restTemplate = new RestTemplate();	 
	 
	 
		public Vehicle retreiveVehiclelById(int id)
		{
			  HttpHeaders headers = new HttpHeaders();

		      headers.setContentType(MediaType.APPLICATION_JSON);
		      
		      HttpEntity <Object> entity = new HttpEntity<>(headers);
		
		      ResponseEntity<Vehicle> result =  restTemplate.exchange("http://localhost:7070/api/vehicles/"+id,
					  HttpMethod.GET, entity,  Vehicle.class );
		      
		      Vehicle veh = result.getBody();
		      
		      return veh;
		}



	 //Get List of Feedbacks
	public List<Vehicle> getAllVehicles() 
	
	{
		  HttpHeaders headers = new HttpHeaders();

	      headers.setContentType(MediaType.APPLICATION_JSON);
	      
	      HttpEntity <Object> entity = new HttpEntity<>(headers);
	
	      ResponseEntity<List<Vehicle>> result =  restTemplate.exchange("http://localhost:7070/api/vehicles",
				  HttpMethod.GET, entity,  new ParameterizedTypeReference<List<Vehicle>>() {} );

	      List<Vehicle> list=result.getBody();
		 
		 return list; 
	}
	
	//Delete a feedback
	public void deleteVehicle(int id)
	{
		  HttpHeaders headers = new HttpHeaders();

	      headers.setContentType(MediaType.APPLICATION_JSON);
	      
	      HttpEntity <Object> entity = new HttpEntity<>(headers);
	      
	      restTemplate.exchange("http://localhost:7070/api/vehicles/"+id,  HttpMethod.DELETE,entity, String.class);
	}
	
	
	public Terminal retreiveTerminalById()
	{
		  HttpHeaders headers = new HttpHeaders();

	      headers.setContentType(MediaType.APPLICATION_JSON);
	      
	      HttpEntity <Object> entity = new HttpEntity<>(headers);
	
	      ResponseEntity <List<Terminal>> result =  restTemplate.exchange("http://localhost:7070/api/terminals",
				  HttpMethod.GET, entity, new ParameterizedTypeReference<List<Terminal>>() {} );
	      
	      List<Terminal> terminal =  result.getBody();
	      
	      return terminal.get(0);
	      

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
	
	
	public void updateVehicle(Vehicle vehicle)
	{
		  HttpHeaders headers = new HttpHeaders();

	      headers.setContentType(MediaType.APPLICATION_JSON);
	      
	      HttpEntity <Vehicle> entity = new HttpEntity<>(vehicle,headers);
	      
	      restTemplate.exchange("http://localhost:7070/api/vehicles",  HttpMethod.PUT, entity, String.class);
	}
	

}
