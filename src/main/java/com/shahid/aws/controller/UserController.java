package com.shahid.aws.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class UserController {
	

	
	@GetMapping("/")
	public String home() {
		return "Welcome to aws and new commit";
		
	}
	@GetMapping("/index")
	public String index() {
		return "this is index and i will implement databse today hiiiiiiiiiii";
		
	}

}
