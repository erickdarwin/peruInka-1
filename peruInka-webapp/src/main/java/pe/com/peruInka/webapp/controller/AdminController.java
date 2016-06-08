package pe.com.peruInka.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.com.peruInka.service.services.PeruInkaService;

@Controller
public class AdminController {

	@Autowired
	private PeruInkaService peruInkaService;

	@RequestMapping(value = "admin/userSystem", method = RequestMethod.GET)
	public String adminUserSystem(Model model, HttpServletRequest request){

		request.getSession().setAttribute("menuHeader", "userSystem");
		
		model.addAttribute("listUserSystem", peruInkaService.findUserSystem());
		
		return "admin/userSystem";
	}


	
	
	
	
	
	
	
	
	
	
	
	
	

	@RequestMapping(value = "admin/dashboard", method = RequestMethod.GET)
	public String adminDashboard(Model model, HttpServletRequest request) {

		request.getSession().setAttribute("menuHeader", "admin");

		System.out.println("admin/dashboard");

		return "admin/dashboard";
	}
}
