package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@SpringBootApplication
@Controller
public class TestController {
	public String nbk_id;
	@RequestMapping("/test")
	public String test(Authentication auth, Model model) {
		//return String.format("You are logged in as: %s", auth.getPrincipal());
		nbk_id = auth.getPrincipal().toString();
		model.addAttribute("nbk_id", nbk_id);

		return "welcome";
	}
	
	@RequestMapping("/test1")
	public String test1() {
		//return String.format("You are logged in as: %s", auth.getPrincipal());
		return "welcome1";
	}
}
