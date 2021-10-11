package com.rentit.controller.company.restController;

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

@RestController
public class CompanyWebController
{
	 @Autowired
	 static RestTemplate restTemplate = new RestTemplate();	 
	 
	 	

	  public List<Company> getCompanies() {
		  
	      HttpHeaders headers = new HttpHeaders();

	      headers.setContentType(MediaType.APPLICATION_JSON);
	      
	      HttpEntity <Object> entity = new HttpEntity<>(headers);
	
	      ResponseEntity<List<Company>> result =  restTemplate.exchange("http://localhost:7070/api/companies",
				  HttpMethod.GET, entity,  new ParameterizedTypeReference<List<Company>>() {} );

		 
		 List<Company> list = result.getBody();
		 
		 return list; 
		  
	  }	 
	  
	  public Company getCompanyById(int id)
	  {
		  
	      HttpHeaders headers = new HttpHeaders();

	      headers.setContentType(MediaType.APPLICATION_JSON);
	      
	      HttpEntity <Object> entity = new HttpEntity<>(headers);
	
	      ResponseEntity<Company> result =  restTemplate.exchange("http://localhost:7070/api/companies/"+id,
				  HttpMethod.GET, entity,  new ParameterizedTypeReference<Company>() {} );

		 
		Company comp = result.getBody();
		 
		 return comp; 
		  
	  }

	public void updateCompanyItself(Company company) 
	{
		
		 HttpHeaders headers = new HttpHeaders();

	      headers.setContentType(MediaType.APPLICATION_JSON);
	      
	      HttpEntity <Company> entity = new HttpEntity<>(company,headers);
	      
	      restTemplate.exchange("http://localhost:7070/api/companies",HttpMethod.PUT,entity,Company.class);
		
	}	
	  
	
	
}
