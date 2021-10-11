package com.rentit.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rentit.controller.admin.restController.Admin_Feedback_WEB_Controller;


@Controller
public class AdminControlsFeedback
{
	Admin_Feedback_WEB_Controller adminController=new Admin_Feedback_WEB_Controller();
	
	
	@RequestMapping(value="/feedbackDisplay", method=RequestMethod.GET)
	public String feedbackDisplay(ModelMap model)
	{
		model.addAttribute("feedbacks", adminController.getAllFeedbacks());
		return "feedback-display";
	}
	
	
	@RequestMapping(value="/deleteFeedback", method=RequestMethod.GET)
	public String deleteCustomer(@RequestParam int id, ModelMap model)
	{
		adminController.deleteFeedback(id);
		model.clear();
		return "redirect:feedbackDisplay";
	}
	

}
