package com.rentit.controller.admin;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rentit.controller.admin.restController.Admin_Terminal_WEB_Controller;
import com.rentit.entity.Terminal;


@Controller
public class AdminControlsTerminal 
{
     Admin_Terminal_WEB_Controller adminController=new Admin_Terminal_WEB_Controller();
	  
	
	@RequestMapping(value="/terminalDisplay", method=RequestMethod.GET)
	public String terminalDisplay(ModelMap model)
	{
		model.addAttribute("terminals", adminController.getAllTerminals());
		return "terminal-display";
	}
	
	
	@RequestMapping(value="/addTerminal", method=RequestMethod.GET)
	public String AddTerminal(ModelMap model)
	{
		model.addAttribute("terminal", new Terminal("", "", 0.0, 0.0));
		return "add-terminal";
	}
	
	
	

	@RequestMapping(value="/addTerminal", method=RequestMethod.POST)
	public String AddTerminalPOST(ModelMap model, @Valid Terminal terminal, BindingResult result )
	{
		if(result.hasErrors())
			return "add-company";
		
		adminController.addTerminal(terminal.getName(),terminal.getDescription(), terminal.getLongitude(), terminal.getLatitude());
		model.clear();
		return "redirect:terminalDisplay";
	}
	
	
	 
	@RequestMapping(value="/updateTerminal", method=RequestMethod.GET)
	public String updateTerminal(@RequestParam int id, ModelMap model)
	{
		model.addAttribute("terminal", adminController.retreiveTerminalById(id));
		return "update-terminal";
	}
	
	@RequestMapping(value="/updateTerminal", method=RequestMethod.POST)
	public String updateCompanyPOST(ModelMap model, @Valid Terminal terminal, BindingResult result)
	{
		if(result.hasErrors())
			return "update-terminal";
		adminController.updateTerminal(terminal);
		model.clear();
		return("redirect:terminalDisplay");
	}
	
	
	@RequestMapping(value="/deleteTerminal", method=RequestMethod.GET)
	public String deleteTerminal(@RequestParam int id, ModelMap model)
	{
		adminController.deleteTerminal(id);
		model.clear();
		return "redirect:terminalDisplay";
	}
	

}
