package com.rentit.controller.company;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rentit.controller.company.restController.CompanyWebController;
import com.rentit.entity.Company;
import com.rentit.login.WelcomeController;


@Controller
public class CompanyController
{
	WelcomeController wc=new WelcomeController();
	CompanyWebController cp=new CompanyWebController();
	
	
	
	
	@RequestMapping(value="/companyDisp", method=RequestMethod.GET)
	public String HomeCompanyPage(ModelMap model) 
	{
		model.addAttribute("company", wc.getLoggedInUser());
		return "company-home-display";
	}
	
	
	//Update Company itself get method
	
	@RequestMapping(value="/updateCompanyItself", method=RequestMethod.GET)
	public String updateMySelf(@RequestParam int id, ModelMap model)
	{
		model.addAttribute("company",cp.getCompanyById(id));
		return "update-company-itself";
	}
	
	
	
	
	//Update Post Method
	
	@RequestMapping(value="/updateCompanyItself", method=RequestMethod.POST)
	public String updateCompanyPOST(ModelMap model, @Valid Company cpo, BindingResult result)
	{
		if(result.hasErrors())
			return "update-company-itself";
		
		
		
		cp.updateCompanyItself(cpo);
		model.clear();
		return("redirect:companyDisp");
	}

	 

}
