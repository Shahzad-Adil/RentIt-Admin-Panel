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

import com.rentit.entity.Company;

@RestController
public class Admin_Company_WEB_Controller
{
	
	 @Autowired
	 static RestTemplate restTemplate = new RestTemplate();	 
	 
	 
	 
	  //Get List of Companies
	  public List<Company> getAllCompanies() 
	  {
		  HttpHeaders headers = new HttpHeaders();

	      headers.setContentType(MediaType.APPLICATION_JSON);
	      
	      HttpEntity <Object> entity = new HttpEntity<>(headers);
	
	      ResponseEntity<List<Company>> result =  restTemplate.exchange("http://localhost:7070/api/companies",
				  HttpMethod.GET, entity,  new ParameterizedTypeReference<List<Company>>() {} 
	      );

		 
		 List<Company> list = result.getBody();
		   		 
		 return list; 
	  }
	 
	 
	  
	  //post a new Company into the database
		public void addCompany(String name, String description, String password) {

			 
			Company company = new Company(name, description,password);
			    
		 restTemplate.postForEntity("http://localhost:7070/api/companies" 
					  , company, Company.class);
			  

		}
		
		public Company retreiveCompanyById(int id)
		{
			  HttpHeaders headers = new HttpHeaders();

		      headers.setContentType(MediaType.APPLICATION_JSON);
		      
		      HttpEntity <Object> entity = new HttpEntity<>(headers);
		
		      ResponseEntity<Company> result =  restTemplate.exchange("http://localhost:7070/api/companies/"+id,
					  HttpMethod.GET, entity,  Company.class );
		      
		      Company company = result.getBody();
		      
		      return company;

		}
	 
		
		
		public void updateCompany(Company company)
		{
			  HttpHeaders headers = new HttpHeaders();

		      headers.setContentType(MediaType.APPLICATION_JSON);
		      
		      HttpEntity <Company> entity = new HttpEntity<>(company,headers);
		      
		      restTemplate.exchange("http://localhost:7070/api/companies",HttpMethod.PUT,entity,Company.class);
		}
		
		public void deleteCompany(int id)
		{
			  HttpHeaders headers = new HttpHeaders();

		      headers.setContentType(MediaType.APPLICATION_JSON);
		      
		      HttpEntity <Object> entity = new HttpEntity<>(headers);
		      
		      restTemplate.exchange("http://localhost:7070/api/companies/"+id,HttpMethod.DELETE,entity, String.class);
		}
		
		
		
		

}
