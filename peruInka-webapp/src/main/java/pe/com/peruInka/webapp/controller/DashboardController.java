package pe.com.peruInka.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import pe.com.peruInka.webapp.util.Person;

@Controller
public class DashboardController {

	@RequestMapping(value = "home/dashboard", method = RequestMethod.GET)
	public String electionsDashboard(Model model, HttpServletRequest request) {
		// model.addAttribute("listElection", listElection);

		return "home/dashboard";
	}

	@RequestMapping(value = "/home/searchJsonById/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody Person searchJsonById(@PathVariable("id") Long id) {
		
		Person person= new Person();
		
		person.setId(id);
		person.setDni("42114381");
		person.setName("Omar");
		person.setLastNameP("Calsin");
		person.setLastNameM("Curo");
		
		return person;
	}

	
	@RequestMapping(value = "/home/searchXMLById/{id}", method = RequestMethod.GET, headers = "Accept=application/xml")
	public @ResponseBody Person searchXMLById(@PathVariable("id") Long id) {
		
		Person person= new Person();
		
		person.setId(id);
		person.setDni("42114381");
		person.setName("Omar");
		person.setLastNameP("Calsin");
		person.setLastNameM("Curo");
		
		return person;
	}
	
}
