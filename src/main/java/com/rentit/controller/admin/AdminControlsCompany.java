package com.rentit.controller.admin;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rentit.controller.admin.restController.Admin_Company_WEB_Controller;
import com.rentit.entity.Company;


@Controller
public class AdminControlsCompany 
{
     Admin_Company_WEB_Controller adminController=new Admin_Company_WEB_Controller();
	
	
	@RequestMapping(value="/companyDisplay", method=RequestMethod.GET)
	public String companyDisplay(ModelMap model)
	{
		model.addAttribute("company", adminController.getAllCompanies());
		return "company-display";
	}
	
		
	@RequestMapping(value="/addCompany", method=RequestMethod.GET)
	public String Addcompany(ModelMap model)
	{
		model.addAttribute("company", new Company("", "",""));
		return "add-company";
	}
	
	
	

	@RequestMapping(value="/addCompany", method=RequestMethod.POST)
	public String AddcompanyPOST(ModelMap model, @Valid Company company, BindingResult result )
	{
		if(result.hasErrors())
			return "add-company";
		
		adminController.addCompany(company.getName(),company.getDescription(),company.getPassword());
		model.clear();
		return "redirect:companyDisplay";
	}
	 
	
	
	@RequestMapping(value="/updateCompany", method=RequestMethod.GET)
	public String updateCompany(@RequestParam int id, ModelMap model)
	{
		model.addAttribute("company", adminController.retreiveCompanyById(id));
		return "update-company";
	}
	
	
	
	
	
	@RequestMapping(value="/updateCompany", method=RequestMethod.POST)
	public String updateCompanyPOST(ModelMap model, @Valid Company company, BindingResult result)
	{
		if(result.hasErrors())
			return "update-company";
		adminController.updateCompany(company);
		model.clear();
		return("redirect:companyDisplay");
	}
	
	
	@RequestMapping(value="/deleteCompany", method=RequestMethod.GET)
	public String deleteCompany(@RequestParam int id, ModelMap model)
	{
		adminController.deleteCompany(id);
		model.clear();
		return "redirect:companyDisplay";
	}
	

}
