package com.example.DockerKuber.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/test-dockerkuber")
	public String getData() {
		return "You are inside Docker Project";
	}
	

}
