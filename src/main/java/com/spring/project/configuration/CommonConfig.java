package com.spring.project.configuration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.*;

@Configuration
@Slf4j
public class CommonConfig {
//	@Value("${daily.limit}")
//	private int dailyLimit;
//	
	//@Bean
	public void checkEnv() {
		log.info("Krushang");
	//	return dailyLimit;
	}
	
	
	
}
