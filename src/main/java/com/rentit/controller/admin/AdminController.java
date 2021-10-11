package com.rentit.controller.admin;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rentit.controller.admin.restController.AdminWebController;
import com.rentit.entity.Admin;
import com.rentit.login.WelcomeController;

@Controller
public class AdminController
{
	WelcomeController wc=new WelcomeController();
	AdminWebController ad=new AdminWebController();
	
	@RequestMapping(value="/error", method=RequestMethod.GET)
	public String errorPage() {
		return "error";
	}
	
	
	@RequestMapping(value="/adminlogin", method=RequestMethod.GET)
	public String loginPage() {
		return "adminlogin";
	}
	
	@RequestMapping(value="/adminDisplay", method=RequestMethod.GET)
	public String HomeAdminPage(ModelMap model) 
	{
		model.addAttribute("admin", wc.getLoggedInAdmin());
		model.addAttribute("admins",ad.getAllAdminsList());
		return "admin-display";
	}
	
	
	

	
	@RequestMapping(value="/updateAdminItself", method=RequestMethod.GET)
	public String updateMySelf(@RequestParam int id, ModelMap model)
	{
		model.addAttribute("admin", ad.getAdminById(id));
		
		return "update-admin-itself";
	}
	
	
	@RequestMapping(value="/updateAdminItself", method=RequestMethod.POST)
	public String updateAdminPOST(ModelMap model, @Valid Admin admin, BindingResult result)
	{
		if(result.hasErrors())
			return "update-admin-itself";
		
		
		
		 ad.updateAdminItself(admin);
		model.clear();
		return("redirect:adminDisplay");
	}
	
	
	@RequestMapping(value="/deleteAdmin", method=RequestMethod.GET)
	public String deleteDriver(@RequestParam int id, ModelMap model)
	{
		int idd= wc.getLoggedInAdminID();
		
		if(idd==id)
		{
			ad.deleteAdmin(id);
			model.clear();
			return "redirect:/";
		}
		else
		{
			ad.deleteAdmin(id);
			model.clear();
			return "redirect:adminDisplay";
		}
		
		
	}
	
	
	
	@RequestMapping(value="/addAdmin", method=RequestMethod.GET)
	public String AddAdmin(ModelMap model)
	{
		model.addAttribute("adminAdd", new Admin("", "", "", "", "", "", ""));
		return "add-admin";
	}
	
	

	  
	@RequestMapping(value="/addAdmin", method=RequestMethod.POST)
	public String AddAdminPOST(ModelMap model, @Valid Admin admin, BindingResult result )
	{
		if(result.hasErrors())
			return "add-admin";
		
		ad.addAdmin(admin.getFullName(),admin.getUserName(),admin.getPassword(),admin.getEmail(),admin.getCnic()
				,admin.getPhone(),admin.getDescription());
		model.clear();
		return "redirect:adminDisplay";
	}
	
	

}
