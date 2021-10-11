package com.rentit.controller.company;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rentit.controller.company.restController.CompanyFeedbackWebController;


@Controller
public class CompanyFeedbackController
{
	CompanyFeedbackWebController  companyController=new CompanyFeedbackWebController();
	
	
	@RequestMapping(value="/feedbackCompanyDisplay", method=RequestMethod.GET)
	public String feedbackDisplay(ModelMap model)
	{
		model.addAttribute("feedbacks", companyController.getFeedbacks());
		return "feedback-company-display";
	}
	
//	
//	@RequestMapping(value="/deleteFeedback", method=RequestMethod.GET)
//	public String deleteCustomer(@RequestParam int id, ModelMap model)
//	{
//		adminController.deleteFeedback(id);
//		model.clear();
//		return "redirect:feedbackDisplay";
//	}
	

}
