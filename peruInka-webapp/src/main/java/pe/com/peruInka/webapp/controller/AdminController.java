package pe.com.peruInka.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {

	@RequestMapping(value = "admin/dashboard", method = RequestMethod.GET)
	public String adminDashboard(Model model, HttpServletRequest request) {

		request.getSession().setAttribute("menuHeader", "admin");

		System.out.println("admin/dashboard");

		return "admin/dashboard";
	}

}
