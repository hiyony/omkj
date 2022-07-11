package com.omkj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.omkj.form.InputForm;


@Controller
public class InputController{
	
	@GetMapping("/")
	public String input(Model model) {
		if(!model.containsAttribute("inputForm")) {
			model.addAttribute("inputForm", new InputForm());
		}
		return "input";
	}
	
	@PostMapping("/")
	public String output(@ModelAttribute("inputForm") 
						 @Validated InputForm inputForm, 
						 BindingResult bindingResult, 
						 RedirectAttributes redirectAttributes) {
		
		if(bindingResult.hasErrors()) {
			redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.inputForm", bindingResult);
			redirectAttributes.addFlashAttribute("inputForm", inputForm);
			return "input";
		}
//		if(bindingResult.hasErrors()) {
//			List<String> errorList = new ArrayList<String>();
//			for(ObjectError error:bindingResult.getAllErrors()) {
//				errorList.add(error.getDefaultMessage());
//			}
//			
//			model.addAttribute("validationError", errorList);
//			return "input";
//		}
//		
		return "/output/output";
	}
	
}
