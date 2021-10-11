package com.rentit.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rentit.controller.admin.restController.Admin_Payment_WEB_Controller;
  

@Controller
public class AdminControlsPayment
{
	Admin_Payment_WEB_Controller adminController=new Admin_Payment_WEB_Controller();
	
	
	@RequestMapping(value="/paymentDisplay", method=RequestMethod.GET)
	public String vehicleDisplay(ModelMap model)
	{
		model.addAttribute("payments", adminController.getAllPayments());
		return "payment-display";
	}
	
	
	@RequestMapping(value="/deletePayment", method=RequestMethod.GET)
	public String deleteTrip(@RequestParam int id, ModelMap model)
	{
		adminController.deletePayment(id);
		model.clear();
		return "redirect:paymentDisplay";
	}
	
	
	
	

}
