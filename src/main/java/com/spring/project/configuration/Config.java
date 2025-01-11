package com.spring.project.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class Config {
	@Value("${daily.limit}")
	private int dailyLimit;
	
	@Bean
	public int checkEnv() {
		log.info("Daily Limit => {}", dailyLimit);
		return dailyLimit;
	}
}
