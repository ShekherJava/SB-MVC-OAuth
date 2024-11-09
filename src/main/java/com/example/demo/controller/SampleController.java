package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {
	
	@GetMapping( value = "/public")
	public String publicPage() {
		return "public.html";
	}
	
	@GetMapping( value = "/secured")
	public String securedPage() {
		return "secured.html";
	}
	

}
