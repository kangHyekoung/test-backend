package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	@GetMapping(value = "/main")
	public String getIntro() {
		return "index";
	}
	
	
	@GetMapping(value = "/select")
	public String getList() {
		return "index";
	}
	
	@GetMapping(value = "/complate")
	public String save() {
		return "index";
	}
	
	
}
