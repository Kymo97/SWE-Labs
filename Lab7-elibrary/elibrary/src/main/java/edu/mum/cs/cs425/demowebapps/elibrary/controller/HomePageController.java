package edu.mum.cs.cs425.demowebapps.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/elibrary")
public class HomePageController {

	
	@GetMapping(value= {"/" ,"/home"})
	public String displayHomePage() {
		return "home/index";
	}
	@GetMapping(value = "test")
	public String testPage() {
		return "home/test";
	}
}
