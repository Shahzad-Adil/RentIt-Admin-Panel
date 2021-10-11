package com.rentit.controller.admin;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rentit.controller.admin.restController.Admin_Driver_WEB_Controller;
import com.rentit.entity.Driver;


@Controller
public class AdminControlsDriver 
{
	Admin_Driver_WEB_Controller adminController=new Admin_Driver_WEB_Controller();
	  
	
	@RequestMapping(value="/driverDisplay", method=RequestMethod.GET)
	public String driverDisplay(ModelMap model)
	{
		
		model.addAttribute("drivers", adminController.getAllDrivers());
		return "driver-display";
	}
	
	@RequestMapping(value="/deleteDriver", method=RequestMethod.GET)
	public String deleteDriver(@RequestParam int id, ModelMap model)
	{
		adminController.deleteDriver(id);
		model.clear();
		return "redirect:driverDisplay";
	}
	
//	@RequestMapping(value="/addDriver", method=RequestMethod.GET)
//	public String AddDriver(ModelMap model)
//	{
//		model.addAttribute("driver", new Driver("", "","", "", "", "","", false));
//		return "add-driver";
//	}
//	
//	@RequestMapping(value="/addDriver", method=RequestMethod.POST)
//	public String AddDriverPOST(ModelMap model, @Valid Driver driver, BindingResult result )
//	{
//		if(result.hasErrors())
//			return "add-driver";
//		
//		adminController.addDriver(driver.getName(),driver.getUserName(), driver.getPassword(), driver.getEmail(), driver.getCnic(),driver.getPhone(), driver.getDescription(), driver.isDriver_on_trip());
//		model.clear();
//		return "redirect:driverDisplay";
//	}
	
	
}
