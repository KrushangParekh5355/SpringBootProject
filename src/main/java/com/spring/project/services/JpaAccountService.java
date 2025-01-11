package com.spring.project.services;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class JpaAccountService extends AccountService{@Override
	public void print() {
		log.info("Reached JPA Account Service");
	}

}
