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

import com.rentit.entity.Customer;

@RestController
public class Admin_Customer_WEB_Controller
{
	
	 @Autowired
	 static RestTemplate restTemplate = new RestTemplate();	 
	 
	 
	 
	  //Get List of Companies
	  public List<Customer> getAllCustomers() 
	  {
		  HttpHeaders headers = new HttpHeaders();

	      headers.setContentType(MediaType.APPLICATION_JSON);
	      
	      HttpEntity <Object> entity = new HttpEntity<>(headers);
	
	      ResponseEntity<List<Customer>> result =  restTemplate.exchange("http://localhost:7070/api/customers",
				  HttpMethod.GET, entity,  new ParameterizedTypeReference<List<Customer>>() {} );

		 
		 List<Customer> list = result.getBody();
		    
		 
		 return list; 
	  }
	  
	  
	  
		public Customer retreiveCustomerlById(int id)
		{
			  HttpHeaders headers = new HttpHeaders();

		      headers.setContentType(MediaType.APPLICATION_JSON);
		      
		      HttpEntity <Object> entity = new HttpEntity<>(headers);
		
		      ResponseEntity<Customer> result =  restTemplate.exchange("http://localhost:7070/api/customers/"+id,
					  HttpMethod.GET, entity,  Customer.class );
		      
		      Customer cus = result.getBody();
		      
		      return cus;
		}
	 
	 
	  
//		public void deleteCustomer(int id)
//		{
//			  HttpHeaders headers = new HttpHeaders();
//
//		      headers.setContentType(MediaType.APPLICATION_JSON);
//		      
//		      HttpEntity <Object> entity = new HttpEntity<>(headers);
//		      
//		      restTemplate.exchange("http://localhost:7070/api/customers/"+id,HttpMethod.DELETE,entity, String.class);
//		}
		
		
		
		

}
