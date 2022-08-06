package com.code.gradleproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@GetMapping(value = "/api")
	public String helloSpring() {
		System.out.println("Hello Spring Boot Controller");
		return "Welcome in Spring Boot";
	}
}
