package com.ibntofail.rhmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginTrueController {
	
	@RequestMapping("/LoginTrue")
	public String LoginTrue() {
		return "LoginTrue";
	}
	
	

}
