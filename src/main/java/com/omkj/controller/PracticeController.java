package com.omkj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class PracticeController {
	
	@GetMapping("/vue")
	public String helloWorld() {
		return "vue/index";
	}
}
