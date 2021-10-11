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

import com.rentit.entity.ContactPerson;

@RestController
public class Admin_ContactPerson_WEB_Controller
{
	
	 @Autowired
	 static RestTemplate restTemplate = new RestTemplate();	 
	 
	 
	 
	  //Get List of ContactPerson
	  public List<ContactPerson> getAllContactPersons() 
	  {
		  HttpHeaders headers = new HttpHeaders();

	      headers.setContentType(MediaType.APPLICATION_JSON);
	      
	      HttpEntity <Object> entity = new HttpEntity<>(headers);
	
	      ResponseEntity<List<ContactPerson>> result =  restTemplate.exchange("http://localhost:7070/api/contactpersons",
				  HttpMethod.GET, entity,  new ParameterizedTypeReference<List<ContactPerson>>() {} );

		 
		 List<ContactPerson> list = result.getBody();
		    
		 
		 return list; 
	  }
	

}
