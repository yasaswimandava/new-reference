package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.User;
import com.example.demo.serviceInterface.UserInterface;

@Controller
public class UserController {
	@Autowired
	private UserInterface userInterface;

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping("/adduser")
	public String addUser() {
		return "user";
	}
	@RequestMapping(value="/saveuser",method =RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") User user)
	{
		userInterface.saveUser(user);
		return "redirect:/";
		
	}
	
	
	
	

}
