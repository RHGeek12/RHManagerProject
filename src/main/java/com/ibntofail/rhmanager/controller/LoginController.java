package com.ibntofail.rhmanager.controller;

import com.ibntofail.rhmanager.model.Personne;
import com.ibntofail.rhmanager.service.PersonneService;
import javax.servlet.http.HttpServletResponse;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;



@Controller
public class LoginController  {
	

	@Autowired
	PersonneService personneService;
	
	@RequestMapping(value="/LoginFalse")
	@ResponseStatus(value=HttpStatus.OK)
	public String LoginFalse(HttpServletRequest request, HttpServletResponse response){
		Personne personne =new Personne();
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		if(personneService.Findlogin(email, password) == true) {
			personne=personneService.findByEmail(email);
			return "loginTrue";
		}
		return "loginFalse";
	}	
}