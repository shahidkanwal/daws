package com.shahid.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	

	
	@GetMapping("/")
	public String home() {
		return "Welcome to aws";
		
	}

}
