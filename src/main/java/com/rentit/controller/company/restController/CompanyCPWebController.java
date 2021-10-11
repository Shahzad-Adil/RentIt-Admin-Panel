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

import com.rentit.entity.Company;
import com.rentit.entity.ContactPerson;
import com.rentit.login.WelcomeController;

@RestController
public class CompanyCPWebController
{
	@Autowired
	 static RestTemplate restTemplate = new RestTemplate();	
	
	WelcomeController wc=new WelcomeController();
	
	  //Get List of ContactPerson
	  public List<ContactPerson> getContactPersons() 
	  {
		  HttpHeaders headers = new HttpHeaders();

	      headers.setContentType(MediaType.APPLICATION_JSON);
	      
	      HttpEntity <Object> entity = new HttpEntity<>(headers);
	
	      ResponseEntity<List<ContactPerson>> result =  restTemplate.exchange("http://localhost:7070/api/contactpersons",
				  HttpMethod.GET, entity,  new ParameterizedTypeReference<List<ContactPerson>>() {} );

		 
		 List<ContactPerson> list = result.getBody();
		 
		 
		 return list; 
	  }
	  
	  
	  public List<ContactPerson> getCP()
	  {
		  List<ContactPerson> list=getContactPersons();
		  
		  List<ContactPerson> filteredList=new ArrayList<ContactPerson>();	 
			 
			 for(ContactPerson comp : list)
			 {
				 if(comp.getCompany().getId()==( wc.getLoggedInUserID()))
					 filteredList.add(comp);
		 
			 }
			 
			
			return filteredList;
	  }
	  
	  
	  //post a new Company into the database
			public void addContactperson(String name,  String email, String cnic, String phone, String description, Company company) {

				 
				ContactPerson comp =new ContactPerson(name, email,cnic,phone,description,company);
				    
			 restTemplate.postForEntity("http://localhost:7070/api/contactpersons" 
						  , comp, ContactPerson.class);
				  

			}
			
			
			//delete a contactperson
			
			public void deleteCP(int id)
			{
				  HttpHeaders headers = new HttpHeaders();

			      headers.setContentType(MediaType.APPLICATION_JSON);
			      
			      HttpEntity <Object> entity = new HttpEntity<>(headers);
			      
			      restTemplate.exchange("http://localhost:7070/api/contactpersons/"+id,HttpMethod.DELETE,entity, String.class);
			}
			
			
			public ContactPerson retreiveContactPersonById(int id)
			{
				  HttpHeaders headers = new HttpHeaders();

			      headers.setContentType(MediaType.APPLICATION_JSON);
			      
			      HttpEntity <Object> entity = new HttpEntity<>(headers);
			
			      ResponseEntity<ContactPerson> result =  restTemplate.exchange("http://localhost:7070/api/contactpersons/"+id,
						  HttpMethod.GET, entity,  ContactPerson.class );
			      
			      ContactPerson comp = result.getBody();
			      
			      return comp;

			}


			public void updateContactPerson(ContactPerson cp) 
			{
				 HttpHeaders headers = new HttpHeaders();

			      headers.setContentType(MediaType.APPLICATION_JSON);
			      
			      HttpEntity <ContactPerson> entity = new HttpEntity<>(cp,headers);
			      			      
			      restTemplate.exchange("http://localhost:7070/api/contactpersons",HttpMethod.PUT,entity,ContactPerson.class);
				
			}

}
