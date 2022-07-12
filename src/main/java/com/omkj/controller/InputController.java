package com.omkj.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.omkj.form.InputForm;


@Controller
@RequestMapping("/")
public class InputController{
	
	@GetMapping("/")
	public String input(Model model) {
		if(!model.containsAttribute("inputForm")) {
			model.addAttribute("inputForm", new InputForm());
		}
		return "input";
	}
	
	@PostMapping("/")
	public String output(@RequestParam("birthday")String bday,
						 @Validated InputForm inputForm, 
						 BindingResult bindingResult,
						 RedirectAttributes redirectAttributes,
						 HttpServletRequest request) {
		
		if(bindingResult.hasErrors()) {
			redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.inputForm", bindingResult);
			redirectAttributes.addFlashAttribute("inputForm", inputForm);
			return "input";
		}

		HttpSession session = request.getSession();
		session.setAttribute("bday", bday);
		
		
		return "redirect:/output";
	}
	
}
