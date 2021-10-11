package com.rentit.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rentit.controller.admin.restController.Admin_Customer_WEB_Controller;


@Controller
public class AdminControlsCustomer
{
	Admin_Customer_WEB_Controller adminController=new Admin_Customer_WEB_Controller();
	
	
	@RequestMapping(value="/customerDisplay", method=RequestMethod.GET)
	public String customerDisplay(ModelMap model)
	{
		model.addAttribute("customers", adminController.getAllCustomers());
		return "customer-display";
	}
	
	
//	@RequestMapping(value="/deleteCustomer", method=RequestMethod.GET)
//	public String deleteCustomer(@RequestParam int id, ModelMap model)
//	{
//		adminController.deleteCustomer(id);
//		model.clear();
//		return "redirect:customerDisplay";
//	}
	

}
