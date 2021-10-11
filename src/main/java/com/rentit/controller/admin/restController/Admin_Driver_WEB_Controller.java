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

import com.rentit.entity.Driver;

@RestController
public class Admin_Driver_WEB_Controller
{
	
	 @Autowired
	 static RestTemplate restTemplate = new RestTemplate();	 
	 
	 
	 
	  //Get List of Companies
	  public List<Driver> getAllDrivers() 
	  {
		  HttpHeaders headers = new HttpHeaders();

	      headers.setContentType(MediaType.APPLICATION_JSON);
	      
	      HttpEntity <Object> entity = new HttpEntity<>(headers);
	
	      ResponseEntity<List<Driver>> result =  restTemplate.exchange("http://localhost:7070/api/drivers",
				  HttpMethod.GET, entity,  new ParameterizedTypeReference<List<Driver>>() {} );

		 
		 List<Driver> list = result.getBody();
		    
		 
		 return list; 
	  }
	  
	  
	  
	  //post a new Company into the database
//			public void addDriver(String name, String userName, String password,
//					String email, String cnic, String phone,
//					String description, boolean driver_on_trip) {
//
//				Driver driver = new Driver(name,userName,password,email,cnic,phone,description,driver_on_trip);
//				    
//				   restTemplate.postForEntity("http://localhost:7070/api/drivers" 
//						  , driver, Driver.class);
//				  
//				 
//
//			}
	 
			
			
			public Driver retreiveDriverlById(int id)
			{
				  HttpHeaders headers = new HttpHeaders();

			      headers.setContentType(MediaType.APPLICATION_JSON);
			      
			      HttpEntity <Object> entity = new HttpEntity<>(headers);
			
			      ResponseEntity<Driver> result =  restTemplate.exchange("http://localhost:7070/api/drivers/"+id,
						  HttpMethod.GET, entity,  Driver.class );
			      
			      Driver driver = result.getBody();
			      
			      return driver;
			}

			
	 
	  
		public void deleteDriver(int id)
		{
			  HttpHeaders headers = new HttpHeaders();

		      headers.setContentType(MediaType.APPLICATION_JSON);
		      
		      HttpEntity <Object> entity = new HttpEntity<>(headers);
		      
		      restTemplate.exchange("http://localhost:7070/api/drivers/"+id,HttpMethod.DELETE,entity, String.class);
		}
		
		
		
		

}
