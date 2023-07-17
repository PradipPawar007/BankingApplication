package com.easybyte.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/Hi")
	public String sayWelcome() {
		return "Welcome To My Basic Security Application";
	}
	
}
