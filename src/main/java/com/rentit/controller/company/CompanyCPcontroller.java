package com.rentit.controller.company;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rentit.controller.company.restController.CompanyCPWebController;
import com.rentit.entity.ContactPerson;
import com.rentit.login.WelcomeController;

@Controller
public class CompanyCPcontroller 
{
	
	WelcomeController wc=new WelcomeController(); 
	
	CompanyCPWebController cpController=new CompanyCPWebController();
	
	@RequestMapping(value="/companyCPDisplay", method=RequestMethod.GET)
	public String contactPersonDisplay(ModelMap model)
	{
		model.addAttribute("contactpersons", cpController.getCP());
		return "cp-display";
	}
	
	
	
	//Adding COntact Person get Request
	@RequestMapping(value="/addContactPerson", method=RequestMethod.GET)
	public String AddCP(ModelMap model)
	{
		model.addAttribute("contactpersons", new ContactPerson("", "",
				"","", "", wc.getLoggedInUser() ));
		return "add-contactperson";
	}
	
	
	//Adding Contact Person Post Request
	@RequestMapping(value="/addContactPerson", method=RequestMethod.POST)
	public String AddcompanyPOST(ModelMap model, @Valid ContactPerson contactperson, BindingResult result )
	{
		if(result.hasErrors())
			return "add-contactperson";
		
		cpController.addContactperson(contactperson.getName(), contactperson.getEmail(),
				contactperson.getCnic(), contactperson.getPhone(), contactperson.getDescription(), wc.getLoggedInUser());
		model.clear();
		return "redirect:companyCPDisplay";
	}
	
	
	
	//deleting COntact Person get Request
	@RequestMapping(value="/deleteContactPerson", method=RequestMethod.GET)
	public String deleteContactPerson(@RequestParam int id, ModelMap model)
	{
		cpController.deleteCP(id);
		model.clear();
		return "redirect:companyCPDisplay";
	}
	
	
	//Update ContactPerson get method
	@RequestMapping(value="/updateContactPerson", method=RequestMethod.GET)
	public String updateContactPerson(@RequestParam int id, ModelMap model)
	{
		model.addAttribute("contactpersons", cpController.retreiveContactPersonById(id));
		return "update-contactperson";
	}
	 
	
	
	
	
	
	@RequestMapping(value="/updateContactPerson", method=RequestMethod.POST)
	public String updateCompanyPOST(ModelMap model, @Valid ContactPerson cp, BindingResult result)
	{
		if(result.hasErrors())
			return "update-contactperson";
		
		cpController.updateContactPerson(cp);
		model.clear();
		return("redirect:companyCPDisplay");
	}

}
