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

import com.rentit.entity.Payment;

@RestController
public class Admin_Payment_WEB_Controller
{
	
	 @Autowired
	 static RestTemplate restTemplate = new RestTemplate();	 
	 
	 
	 

		public List<Payment> getAllPayments() 
		{  
			HttpHeaders headers = new HttpHeaders();

		      headers.setContentType(MediaType.APPLICATION_JSON);
		      
		      HttpEntity <Object> entity = new HttpEntity<>(headers);
		
		      ResponseEntity<List<Payment>> result =  restTemplate.exchange("http://localhost:7070/api/payments",
					  HttpMethod.GET, entity,  new ParameterizedTypeReference<List<Payment>>() {} );

			 
			 List<Payment> list = result.getBody();
			    
			 
			 return list; 
		}

	
	 
	  
	  
		 
		public void deletePayment(int id)
		{
			  HttpHeaders headers = new HttpHeaders();

		      headers.setContentType(MediaType.APPLICATION_JSON);
		      
		      HttpEntity <Object> entity = new HttpEntity<>(headers);
		      
		      restTemplate.exchange("http://localhost:7070/api/payments/"+id,HttpMethod.DELETE,entity, String.class);
		}




}
