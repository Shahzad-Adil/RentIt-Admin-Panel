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

import com.rentit.entity.Admin;

@RestController
public class AdminWebController {


	 @Autowired
	 static RestTemplate restTemplate = new RestTemplate();	 
	 
	 
	  public List<Admin> getAllAdminsList() {
		  
	      HttpHeaders headers = new HttpHeaders();

	      headers.setContentType(MediaType.APPLICATION_JSON);
	      
	      HttpEntity <Object> entity = new HttpEntity<>(headers);
	
	      ResponseEntity<List<Admin>> result =  restTemplate.exchange("http://localhost:7070/api/admins",
				  HttpMethod.GET, entity,  new ParameterizedTypeReference<List<Admin>>() {} );

		 
		 List<Admin> list = result.getBody();
		 
		 return list; 
		  
	  }


	public Admin getAdminById(int id) 
	{
	    HttpHeaders headers = new HttpHeaders();

	      headers.setContentType(MediaType.APPLICATION_JSON);
	      
	      HttpEntity <Object> entity = new HttpEntity<>(headers);
	
	      ResponseEntity<Admin> result =  restTemplate.exchange("http://localhost:7070/api/admins/"+id,
				  HttpMethod.GET, entity,  new ParameterizedTypeReference<Admin>() {} );
	      
	      Admin admin=result.getBody();
	      

		return admin;
	}	 
	  
	  
	
	
	public void updateAdminItself(Admin admin) 
	{
		
		 HttpHeaders headers = new HttpHeaders();

	      headers.setContentType(MediaType.APPLICATION_JSON);
	      
	      HttpEntity <Admin> entity = new HttpEntity<>(admin,headers);
	      
	      restTemplate.exchange("http://localhost:7070/api/admins",HttpMethod.PUT,entity,Admin.class);
		
	}


	public void deleteAdmin(int id)
	{	
		HttpHeaders headers = new HttpHeaders();

	      headers.setContentType(MediaType.APPLICATION_JSON);
	      
	      HttpEntity <Object> entity = new HttpEntity<>(headers);
	      
	      restTemplate.exchange("http://localhost:7070/api/admins/"+id,HttpMethod.DELETE,entity, String.class);
		
	}


	public void addAdmin(String fullName, String userName, String password, String email, String cnic, String phone,
			String description) 
	{
		Admin admin=new Admin(fullName, userName,password,email,cnic,phone,description);
		
		 
		   restTemplate.postForEntity("http://localhost:7070/api/admins" 
				  , admin, Admin.class);
		
	}	
	  
	 
}








