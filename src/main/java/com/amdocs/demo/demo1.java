package com.amdocs.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class demo1 {
	@GetMapping("/in")
	public String show() {
		return "Welcome to spring boot and jenkins";
	}

}
