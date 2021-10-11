package com.rentit.controller.admin;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rentit.controller.admin.restController.Admin_Trip_WEB_Controller;
import com.rentit.entity.Terminal;
import com.rentit.entity.Trip;
  

@Controller
public class AdminControlsTrip
{
	Admin_Trip_WEB_Controller adminController=new Admin_Trip_WEB_Controller();
	
	Trip tripp=null;
	
	Terminal terminal;
	
	@RequestMapping(value="/tripDisplay", method=RequestMethod.GET)
	public String vehicleDisplay(ModelMap model)
	{
		model.addAttribute("trips", adminController.getAllTrips());
		return "trip-display";
	}
	
	
	@RequestMapping(value="/deleteTrip", method=RequestMethod.GET)
	public String deleteTrip(@RequestParam int id, ModelMap model)
	{
		adminController.deleteTrip(id);
		model.clear();
		return "redirect:tripDisplay";
	}
	
	@RequestMapping(value="/acceptTrip", method=RequestMethod.GET)
	public String acceptTrip(@RequestParam int id, ModelMap model)
	{
		adminController.acceptTrip(id);
		model.clear();
		return "redirect:tripDisplay";
	}
	
	
	
	
	@RequestMapping(value="/startTrip", method=RequestMethod.GET)
	public String startTrip(@RequestParam int id, ModelMap model)
	{
		tripp=adminController.retreiveTriplById(id);
		terminal = tripp.getTerminal();
		model.addAttribute("trip", tripp);
		return "start-trip";
	}
	
	
	
	@RequestMapping(value="/updateTrip", method=RequestMethod.GET)
	public String updateTrip(@RequestParam int id, ModelMap model)
	{
		tripp=adminController.retreiveTriplById(id);
		tripp.setDescription(" ");
		terminal = tripp.getTerminal();
		model.addAttribute("trip", tripp);
		return "update-trip";
	}
	
	@RequestMapping(value="/updateTrip", method=RequestMethod.POST)
	public String updateCompanyPOST(ModelMap model,  @Valid Trip trip, BindingResult result)
	{
		
		System.out.println(result);
		
		if(result.hasErrors())
		{
			System.out.println("Error Sending back");
			return "update-trip";
		}
		
		if(trip.getReading_at_end()<= trip.getReading_at_start())
		{
			trip.setDescription("Meter reading at end should be greater then Meter reading at start");
			return "update-trip";
		}
		else
		{
			trip.setDescription("def desc");
			trip.setCustomer(tripp.getCustomer());
			if(trip.isOptionDriver())
				trip.setDriver(tripp.getDriver());
			else
				trip.setDriver(null);
		
			trip.setStatus("ending");
			trip.setTerminal(terminal);
			adminController.updateTrip(trip);
			model.clear();
			return("redirect:tripDisplay");
			
		}
			
		
	
	}
	
	
	@RequestMapping(value="/startTrip", method=RequestMethod.POST)
	public String startCompanyPOST(ModelMap model,  @Valid Trip trip, BindingResult result)
	{
		
		System.out.println(result);
		
		if(result.hasErrors())
		{
			System.out.println("Error Sending back");
			return "start-trip";
		}
			
		
		trip.setCustomer(tripp.getCustomer());
		if(trip.isOptionDriver())
			trip.setDriver(tripp.getDriver());
		else
			trip.setDriver(null);
	
		trip.setStatus("current");
		
		trip.setTerminal(terminal);
		adminController.updateTrip(trip);
		model.clear();
		return("redirect:tripDisplay");
	}

	
	

}
