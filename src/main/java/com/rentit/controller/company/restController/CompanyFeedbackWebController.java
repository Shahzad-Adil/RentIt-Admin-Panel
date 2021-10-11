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

import com.rentit.entity.Feedback;
import com.rentit.login.WelcomeController;

@RestController
public class CompanyFeedbackWebController
{
	
	 @Autowired
	 static RestTemplate restTemplate = new RestTemplate();	 
	 
	 WelcomeController wc=new WelcomeController();
	 
	 
	



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
	
	public List<Feedback>  getFeedbacks() 
	{
		List<Feedback> list=getAllFeedbacks();
		List<Feedback> filteredList=new ArrayList<Feedback>();
		
		for(Feedback feed : list )
		{
			if(feed.getVehicle().getCompany().getId()==wc.getLoggedInUserID())
				filteredList.add(feed);
		}

		return filteredList;
	}
	

}
