package com.omkj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PracticeController {
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "hello!";
	}
}
