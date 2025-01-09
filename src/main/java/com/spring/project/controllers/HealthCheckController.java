package com.spring.project.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health/check")

public class HealthCheckController {
	
	@GetMapping
	public HttpStatus heathCheck() {
		return HttpStatus.OK;
	}
}
