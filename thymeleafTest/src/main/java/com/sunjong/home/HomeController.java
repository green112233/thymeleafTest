package com.sunjong.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;


@Controller
public class HomeController {
	@GetMapping(value="/hello")
	public String hello(Model model) {
		model.addAttribute("member","홍길동");
		return "hello";
	}

	@GetMapping(value="hyper")
	public String hyper() {
		return "hyperTest";
	}
	
	@GetMapping(value="/hyperResult")
	public String hyperResult(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		model.addAttribute("id",id);
		model.addAttribute("pw",pw);
		
		return "hyperResult";
	}
}
