package com.register.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.register.dto.Reg_table;
import com.register.service.Reg_service;

@Controller
public class Reg_Controller {

	@Autowired
	private	Reg_service reg_service;
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@PostMapping("/register")
	public String registor(@ModelAttribute Reg_table table,HttpSession session) {
		System.out.println(table);
		if(reg_service.register(table,table.getMnumber())) {
			session.setAttribute("msg", "Registration is failed");		
		}
		else {
			session.setAttribute("msg", "Registration is Successful");	
		}
				
		
		return "redirect:/";
	}
	
}
