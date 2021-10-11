package com.rentit.controller.admin;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rentit.controller.admin.restController.Admin_Vehicle_WEB_Controller;
import com.rentit.entity.Company;
import com.rentit.entity.Vehicle;
import com.rentit.login.WelcomeController;


@Controller
public class AdminControlsVehicle
{
	Admin_Vehicle_WEB_Controller adminController=new Admin_Vehicle_WEB_Controller();
	
	 WelcomeController wc=new WelcomeController();
	 
	 Company company;
	
	
	@RequestMapping(value="/vehicleDisplay", method=RequestMethod.GET)
	public String vehicleDisplay(ModelMap model)
	{
		model.addAttribute("vehicles", adminController.getAllVehicles());
		return "vehicle-display";
	}
	
	
	@RequestMapping(value="/deleteVehicle", method=RequestMethod.GET)
	public String deleteCustomer(@RequestParam int id, ModelMap model)
	{
		adminController.deleteVehicle(id);
		model.clear();
		return "redirect:vehicleDisplay";
	}
	
	
	@RequestMapping(value="/updateVehicle", method=RequestMethod.GET)
	public String updateCompany(@RequestParam int id, ModelMap model)
	{
		Vehicle vehicle=adminController.retreiveVehiclelById(id);
		vehicle.setTerminalId(vehicle.getTerminal().getId());
		
		company=vehicle.getCompany();
		
		model.addAttribute("vehicle", vehicle);
		
		
		return "update-vehicle";
	}
	
	
	@RequestMapping(value="/updateVehicle", method=RequestMethod.POST)
	public String updateVehiclePOST(ModelMap model, @Valid Vehicle veh, BindingResult result)
	{
		
		
		if(result.hasErrors())
			return "update-vehicle";
		
		veh.setCompany(wc.getLoggedInUser());
		veh.setTerminal(adminController.retreiveTerminalById(veh.getTerminalId()));
		
		veh.setCompany(company);
		adminController.updateVehicle(veh);
		model.clear();
		return("redirect:vehicleDisplay");
	}
	
	
	
	

}
