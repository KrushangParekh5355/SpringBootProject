package com.spring.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.project.services.AccountService;
import com.spring.project.services.CommonService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/health/check")
@Slf4j
@RequiredArgsConstructor
public class HealthCheckController {
	
//	@Autowired
//	private CommonService service;
	
	private final CommonService service;
	
	@Autowired
	private @Qualifier("jdbcAccountService") AccountService accountService;
	
	@GetMapping
	public HttpStatus healthCheck() {
		log.info("Reached -> HealthCheck Controller");
		service.test();
		accountService.print();
		return HttpStatus.OK;
	}
}
