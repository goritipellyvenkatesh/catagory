package com.dakr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {
	@RequestMapping("/req1")
    public String hi() {
		return "savePage";
	}
	
	@PostMapping("/save")
	public String save() {
		return null;
	}
	

}
