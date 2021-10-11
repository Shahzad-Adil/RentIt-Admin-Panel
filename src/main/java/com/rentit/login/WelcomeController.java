package com.rentit.login;

import java.util.List;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rentit.controller.admin.restController.AdminWebController;
import com.rentit.controller.company.restController.CompanyWebController;
import com.rentit.entity.Admin;
import com.rentit.entity.Company;

@Controller
public class WelcomeController 
{

	 private CompanyWebController cp=new CompanyWebController();
	 private AdminWebController ap=new AdminWebController();
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showWelcomePage() {
	
		return "welcome";
	}
	
	@RequestMapping(value="/access-denied", method=RequestMethod.GET)
	public String accessDeniedPage() {
		return "access-denied";
	}
	
	
	 @SuppressWarnings("unused")
	public int getLoggedInUserID() 
	  {
		  String name="";
			Object principal = SecurityContextHolder.getContext()
					.getAuthentication().getPrincipal();

			
			if (principal instanceof UserDetails)
				 name= ((UserDetails) principal).getUsername();
		

			List<Company> list=cp.getCompanies();
			for(Company comp : list)
			{
				if(comp.getName().equals(name))
					return comp.getId();
			}
			return -1;
	  }


		public Company getLoggedInUser()
		{
			String name = null;
			Object principal = SecurityContextHolder.getContext()
					.getAuthentication().getPrincipal();

			
			if (principal instanceof UserDetails)
				 name= ((UserDetails) principal).getUsername();

			List<Company> list=cp.getCompanies();
			for(Company comp : list)
			{
				if(comp.getName().equals(name))
					return comp;
			}
			return null;
		}
		
		public Admin getLoggedInAdmin()
		{
			String username = null;
			Object principal = SecurityContextHolder.getContext()
					.getAuthentication().getPrincipal();

			
			if (principal instanceof UserDetails)
				 username= ((UserDetails) principal).getUsername();
			
			List<Admin> list=ap.getAllAdminsList();
			for(Admin admin : list)
			{
				if(admin.getUserName().equals(username))
				{
					return admin;
				}
			}
			return null;

		}


		public int getLoggedInAdminID() 
		
		{
			String name="";
			Object principal = SecurityContextHolder.getContext()
					.getAuthentication().getPrincipal();

			
			if (principal instanceof UserDetails)
				 name= ((UserDetails) principal).getUsername();
		

			List<Admin> list=ap.getAllAdminsList();
			for(Admin comp : list)
			{
				if(comp.getUserName().equals(name))
					return comp.getId();
			}
			return -1;
			
		}

}


