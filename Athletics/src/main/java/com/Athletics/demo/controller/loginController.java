package com.Athletics.demo.controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Athletics.demo.model.loginModel;
import com.Athletics.demo.service.loginService;

@RestController
public class loginController {
	

		@Autowired
		loginService lser;
		
		@PostMapping("/checkLogin")
		public String validateUser(@RequestBody loginModel l)
		{
			System.out.println(l.getUsername());
			return lser.validateUser(l.getUsername(), l.getPassword());
		}
		
		@PostMapping("/addUser")
		public loginModel addDetails(@RequestBody loginModel l)
		{
			return lser.saveUser(l);
		}
}
