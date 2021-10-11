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

@RestController
public class Admin_Terminal_WEB_Controller
{
	
	 @Autowired
	 static RestTemplate restTemplate = new RestTemplate();	 
	 
	 
	 

		public List<Terminal> getAllTerminals() 
		{
			HttpHeaders headers = new HttpHeaders();

		      headers.setContentType(MediaType.APPLICATION_JSON);
		      
		      HttpEntity <Object> entity = new HttpEntity<>(headers);
		
		      ResponseEntity<List<Terminal>> result =  restTemplate.exchange("http://localhost:7070/api/terminals",
					  HttpMethod.GET, entity,  new ParameterizedTypeReference<List<Terminal>>() {} );

			 
			 List<Terminal> list = result.getBody();
			    
			 
			 return list; 
		}

	
	 
	  
	  //post a new Company into the database
		public void addTerminal(String name, String description, double longi, double lat) {

			  Terminal terminal = new Terminal(name, description, longi, lat);
			    
			 restTemplate.postForEntity("http://localhost:7070/api/terminals" 
					  , terminal, Terminal.class);
			  
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
	 
		
		
		public void updateTerminal(Terminal terminal)
		{
			  HttpHeaders headers = new HttpHeaders();

		      headers.setContentType(MediaType.APPLICATION_JSON);
		      
		      HttpEntity <Terminal> entity = new HttpEntity<>(terminal,headers);
		      
		      restTemplate.exchange("http://localhost:7070/api/terminals",HttpMethod.PUT,entity,Terminal.class);
		}
		
		
		
		public void deleteTerminal(int id)
		{
			  HttpHeaders headers = new HttpHeaders();

		      headers.setContentType(MediaType.APPLICATION_JSON);
		      
		      HttpEntity <Object> entity = new HttpEntity<>(headers);
		      
		      restTemplate.exchange("http://localhost:7070/api/terminals/"+id,HttpMethod.DELETE,entity, String.class);
		}




}
