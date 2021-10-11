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
import com.rentit.entity.Notification;
import com.rentit.entity.PushNotificationRequest;
import com.rentit.entity.Trip;

@RestController
public class Admin_Trip_WEB_Controller
{
	
	Admin_Customer_WEB_Controller con=new Admin_Customer_WEB_Controller();
	 @Autowired
	 static RestTemplate restTemplate = new RestTemplate();	 
	 
	 
	 

		public List<Trip> getAllTrips() 
		{  
			HttpHeaders headers = new HttpHeaders();

		      headers.setContentType(MediaType.APPLICATION_JSON);
		      
		      HttpEntity <Object> entity = new HttpEntity<>(headers);
		
		      ResponseEntity<List<Trip>> result =  restTemplate.exchange("http://localhost:7070/api/trips",
					  HttpMethod.GET, entity,  new ParameterizedTypeReference<List<Trip>>() {} );
		      
		     

			 
			 List<Trip> list = result.getBody();
			 
			 return list; 
		}
		
		public Trip retreiveTriplById(int id)
		{
			  HttpHeaders headers = new HttpHeaders();

		      headers.setContentType(MediaType.APPLICATION_JSON);
		      
		      HttpEntity <Object> entity = new HttpEntity<>(headers);
		
		      ResponseEntity<Trip> result =  restTemplate.exchange("http://localhost:7070/api/trips/"+id,
					  HttpMethod.GET, entity,  Trip.class );
		      
		      Trip trip = result.getBody();
		      
		      return trip;
		}

	
	 
	  
	  
		
		public void deleteTrip(int id)
		{
			  HttpHeaders headers = new HttpHeaders();

		      headers.setContentType(MediaType.APPLICATION_JSON);
		      
		      HttpEntity <Object> entity = new HttpEntity<>(headers);
		      
		      restTemplate.exchange("http://localhost:7070/api/trips/"+id,HttpMethod.DELETE,entity, String.class);
		}
		
		public void acceptTrip(int id)
		{
			  HttpHeaders headers = new HttpHeaders();

		      headers.setContentType(MediaType.APPLICATION_JSON);
		      		      
		      Trip trip = retreiveTriplById(id);
		      
		      trip.setStatus("accepted");
		      
		      HttpEntity <Trip> entity = new HttpEntity<>(trip,headers);

		      
		      ResponseEntity<List<Notification>> result =  restTemplate.exchange("http://localhost:7070/api/notifications",
					  HttpMethod.GET, entity,  new ParameterizedTypeReference<List<Notification>>() {} );
		      
		      
		      
		      List<Notification> notify=result.getBody();
		      
		      
		      Notification notification = null;
		      
		      Customer cus=con.retreiveCustomerlById(trip.getCustomer().getId());
		      
		      for(int i=0;i<notify.size();i++)
		      {
		    	  
		    	  System.out.println(notify.get(i).getEmail());  
		    	  
		    	  
		    	  if(notify.get(i).getEmail().equals(cus.getEmail()))
		    	  {
		    		  notification=notify.get(i);
		    	  }
		      }
		      
		      
		      
		      System.out.println("-------------------------------------------------------------------");
		      System.out.println(notification.getEmail());
		      System.out.println("-------------------------------------------------------------------");
		      
		      
		      
		      PushNotificationRequest request= new PushNotificationRequest("Notification", "Trip Status Updated",
    		  "New Message", notification.getToken() );
		      
      
		      restTemplate.exchange("http://localhost:7070/api/trips",HttpMethod.PUT,entity,Trip.class);
		      
		      
		      System.out.println("-------------------------------------------------------------------");
		      
		      restTemplate.postForEntity("http://localhost:7070/notification/token" 
					  , request, PushNotificationRequest.class);
		      
		      
		      
		      if(trip.isOptionDriver())
		      {
			      	Notification noti=null;
		    	  for(int i=0;i<notify.size();i++)
			      {
			    	  
			    	  System.out.println(notify.get(i).getEmail());  
			    	  
			    	  
			    	  if(notify.get(i).getEmail().equals(trip.getDriver().getEmail()))
			    	  {
			    		  noti=notify.get(i);
			    	  }
			      }
		    	  
		    	   PushNotificationRequest requestDriver= new PushNotificationRequest("Notification", "New Trip assigned",
		    	    		  "New Message", noti.getToken() );
		    	   
		    	   restTemplate.postForEntity("http://localhost:7070/notification/token" 
							  , requestDriver, PushNotificationRequest.class);
		    	  
		    	  
		      }
		      
		}

		
		
		public void updateTrip(Trip trip)
		{
			  HttpHeaders headers = new HttpHeaders();

		      headers.setContentType(MediaType.APPLICATION_JSON);
		      
		      HttpEntity <Trip> entity = new HttpEntity<>(trip,headers);
		      

		      
		      
		      ResponseEntity<List<Notification>> result =  restTemplate.exchange("http://localhost:7070/api/notifications",
					  HttpMethod.GET, entity,  new ParameterizedTypeReference<List<Notification>>() {} );
		      
		      
		      
		      List<Notification> notify=result.getBody();
		      
		      
		      Notification notification = null;
		      
		      Customer cus=con.retreiveCustomerlById(trip.getCustomer().getId());
		      
		      for(int i=0;i<notify.size();i++)
		      {
		    	  System.out.println(cus.getEmail());
		    	  
		    	  System.out.println(notify.get(i).getEmail());
		    	  
		    	  
		    	  
		    	  
		    	  if(notify.get(i).getEmail().equals(cus.getEmail()))
		    	  {
		    		  notification=notify.get(i);
		    	  }
		      }
		      
		      System.out.println("-------------------------------------------------------------------");
		      System.out.println(notification.getEmail());
		      System.out.println("-------------------------------------------------------------------");
		      
		      
		      
		      PushNotificationRequest request= new PushNotificationRequest("Notification", "Trip Status Updated",
    		  "New Message", notification.getToken() );
      
      
		     
		      
		      restTemplate.exchange("http://localhost:7070/api/trips",HttpMethod.PUT,entity,Trip.class);
		      
		      
		      System.out.println("-------------------------------------------------------------------");
		      
		      restTemplate.postForEntity("http://localhost:7070/notification/token" 
					  , request, PushNotificationRequest.class);
		}



}
