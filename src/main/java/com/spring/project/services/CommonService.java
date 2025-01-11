package com.spring.project.services;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CommonService {
	public void test() {
		log.info("This is test from Common Service");
	}
}
