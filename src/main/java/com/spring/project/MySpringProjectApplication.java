package com.spring.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class MySpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringProjectApplication.class, args);
	}
	
	@PostConstruct
	public void inti() {
		log.info("Application Initiallized");
	}
	
//	@PreDestroy
//	public void destroy() {
//		log.info("Application Destroyed!");
//	}
}
