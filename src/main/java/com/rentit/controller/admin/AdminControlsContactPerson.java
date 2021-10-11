package com.rentit.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rentit.controller.admin.restController.Admin_ContactPerson_WEB_Controller;


@Controller
public class AdminControlsContactPerson
{
	Admin_ContactPerson_WEB_Controller adminController=new Admin_ContactPerson_WEB_Controller();
	
	
	@RequestMapping(value="/contactPersonDisplay", method=RequestMethod.GET)
	public String contactPersonDisplay(ModelMap model)
	{
		model.addAttribute("contactpersons", adminController.getAllContactPersons());
		return "contactperson-display";
	}
	

}
