package pe.com.peruInka.webapp.controller;

import java.util.ArrayList;
import java.util.List;

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

		Person person = new Person();
		person.setName("Omar");
		
		List<Person> list=new ArrayList<Person>();
		list.add(person);
		
		model.addAttribute("listPerson", list);

		return "home/dashboard";
	}

	@RequestMapping(value = "/home/searchJsonById/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody String searchJsonById(@PathVariable("id") Long id) {

		return "Return value::: " + id;
	}

	@RequestMapping(value = "/home/searchXMLById/{id}", method = RequestMethod.GET, headers = "Accept=application/xml")
	public @ResponseBody String searchXMLById(@PathVariable("id") Long id) {

		return "Return value::: " + id;
	}

}
