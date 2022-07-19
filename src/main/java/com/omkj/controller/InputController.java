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

/**
 * 最初画面と結果出力画面を繋ぐコントローラークラスです。
 * 
 * @author h_kim
 * @version 1.0
 */
@Controller
@RequestMapping("/")
public class InputController{
	
	/**
	 * 最初画面を出力する。
	 * 
	 * @param model モデル
	 * @return html画面
	 */
	@GetMapping("/")
	public String input(Model model) {
		if(!model.containsAttribute("inputForm")) {
			model.addAttribute("inputForm", new InputForm());
		}
		return "vue/input";
	}
	
	/**
	 * 結果を出力ためにOutputActionに連結する。
	 * 条件に合ってない場合(yyyyMMddの方式以外)はvalidateでエラーを呼び出す。
	 * 合っている場合はOutputActionに連結する。
	 * 
	 * @param bday 誕生日
	 * @param inputForm inputフォーム
	 * @param bindingResult bindingResult
	 * @param redirectAttributes redirectAttributes
	 * @param request リクエスト
	 * @return html画面
	 */
	@PostMapping("/")
	public String output(@RequestParam("birthday")String bday,
						 @Validated InputForm inputForm, 
						 BindingResult bindingResult,
						 RedirectAttributes redirectAttributes,
						 HttpServletRequest request) {
		
		if(bindingResult.hasErrors()) {
			redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.inputForm", bindingResult);
			redirectAttributes.addFlashAttribute("inputForm", inputForm);
			return "vue/input";
		}

		HttpSession session = request.getSession();
		session.setAttribute("bday", bday);
		
		
		return "redirect:/output";
	}
	
}
