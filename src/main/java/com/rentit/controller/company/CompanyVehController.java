package com.rentit.controller.company;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rentit.controller.company.restController.CompanyVehicleWebController;
import com.rentit.entity.Terminal;
import com.rentit.entity.Vehicle;
import com.rentit.login.WelcomeController;


@Controller
public class CompanyVehController
{
	 CompanyVehicleWebController companyController=new CompanyVehicleWebController();
	 WelcomeController wc=new WelcomeController();
	
	
	@RequestMapping(value="/companyVehicleDisplay", method=RequestMethod.GET)
	public String vehicleDisplay(ModelMap model)
	{
		model.addAttribute("vehicles", companyController.getAllCompVehicles());
		return "company-vehicle-display";
	}
	

	@RequestMapping(value="/addVehicle", method=RequestMethod.GET)
	public String AddVehicle(ModelMap model)
	{
		Terminal defaultTerminal=companyController.retreiveTerminalById();
		model.addAttribute("vehicle", new Vehicle("", "", "", true, "", "", wc.getLoggedInUser(), defaultTerminal));
		return "add-vehicle";
	}
	
	@RequestMapping(value="/addVehicle", method=RequestMethod.POST)
	public String AddVehiclePOST(ModelMap model, @Valid Vehicle vehicle, BindingResult result )
	{
		
		Terminal defaultTerminal=companyController.retreiveTerminalById();

		if(result.hasErrors())
			return "add-vehicle";
		
		companyController.addVehicle(vehicle.getV_reg_no(),vehicle.getModelNumber(),vehicle.getCategory(), 
				vehicle.isStatus(),
				vehicle.getV_make(), vehicle.getV_description(), wc.getLoggedInUser(), defaultTerminal  );
		model.clear();
		return "redirect:companyVehicleDisplay";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
