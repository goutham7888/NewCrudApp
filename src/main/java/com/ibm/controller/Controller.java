package com.ibm.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.model.AppUser;
import com.ibm.service.UserService;

@RestController
@RequestMapping("/api")
public class Controller {

	@Autowired
	private UserService service;

	
	@PostMapping("/public/register")
	public String adduser(@RequestBody AppUser appuser) {
		service.addUser(appuser);
		return "User add";
	}
	
	@GetMapping("/all")
	public List<AppUser> getuers(){
		return service.getAll();
	}
	
}
