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

import com.rentit.entity.Feedback;

@RestController
public class Admin_Feedback_WEB_Controller
{
	
	 @Autowired
	 static RestTemplate restTemplate = new RestTemplate();	 

	 //Get List of Feedbacks
	public List<Feedback> getAllFeedbacks() 
	
	{
		  HttpHeaders headers = new HttpHeaders();

	      headers.setContentType(MediaType.APPLICATION_JSON);
	      
	      HttpEntity <Object> entity = new HttpEntity<>(headers);
	
	      ResponseEntity<List<Feedback>> result =  restTemplate.exchange("http://localhost:7070/api/feedbacks",
				  HttpMethod.GET, entity,  new ParameterizedTypeReference<List<Feedback>>() {} );

		 
		 List<Feedback> list = result.getBody();
		    
		 
		 return list; 
	}
	
	//Delete a feedback
	public void deleteFeedback(int id)
	{
		  HttpHeaders headers = new HttpHeaders();

	      headers.setContentType(MediaType.APPLICATION_JSON);
	      
	      HttpEntity <Object> entity = new HttpEntity<>(headers);
	      
	      restTemplate.exchange("http://localhost:7070/api/feedbacks/"+id,HttpMethod.DELETE,entity, String.class);
	}
	

}
