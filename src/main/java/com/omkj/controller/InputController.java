package com.omkj.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.omkj.form.InputForm;


@Controller
public class InputController{
	
	@GetMapping("/")
	public String input(Model model) {
		
		model.addAttribute("inputForm", new InputForm());
		return "input";
	}
	
	@PostMapping("/")
	public String output(@Valid InputForm inputForm, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			
			return "input";
		}
		
		return "/output/output";
	}
	
}
