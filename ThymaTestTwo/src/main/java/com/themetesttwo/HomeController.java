package com.themetesttwo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String aa(Model model) {
		Person model2 = new Person();
		model2.setFirstname("test1");
		model2.setLastname("test2");
		model.addAttribute("obj",model2);
		return "index";
	}
	
	@RequestMapping(value = "/ioi", method = RequestMethod.POST)
	public @ResponseBody String aa( HttpServletRequest request, HttpServletResponse response) {
		/*Person model2 = (Person) request.getParameter("obj");*/

		return "index";
	}
}
