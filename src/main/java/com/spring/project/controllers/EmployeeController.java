package com.spring.project.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/contact/list")
public class EmployeeController {

	private static Map<Integer, Object> contactList = new HashMap<>();
	
	{
		Map<String, Object>cl1 = new HashMap<>();
		cl1.put("Phone Number", 1234567890);
		cl1.put("name", "Krishna");
		contactList.put(1, cl1);
		
		Map<String, Object>cl2 = new HashMap<>();
		cl2.put("Phone Number", 1234567892);
		cl2.put("name", "Krushang");
		contactList.put(2, cl2);
		
		Map<String, Object>cl3 = new HashMap<>();
		cl3.put("Phone Number", 1234567893);
		cl3.put("name", "Rushi");
		contactList.put(3, cl3);
		
		Map<String, Object>cl4 = new HashMap<>();
		cl4.put("Phone Number", 1234567894);
		cl4.put("name", "Tinu");
		contactList.put(4, cl4);
		
		Map<String, Object>cl5 = new HashMap<>();
		cl5.put("Phone Number", 1234567895);
		cl5.put("name", "Nita");
		contactList.put(5, cl5);
		
		Map<String, Object>cl6 = new HashMap<>();
		cl6.put("Phone Number", 1234567896);
		cl6.put("name", "Jikkar");
		contactList.put(6, cl6);
		
		Map<String, Object>cl7 = new HashMap<>();
		cl7.put("Phone Number", 1234567897);
		cl7.put("name", "Shubham");
		contactList.put(7, cl7);
	}
	
	 
	@GetMapping("/all")
	public ResponseEntity<?> getAllEmployee(){
		log.info("Contact List Uploaded!");
		return ResponseEntity.ok(contactList);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getAllEmployeeDetails(@PathVariable int id){
		log.info("Contact List Uploaded for {}", contactList.get(id));
		return ResponseEntity.ok(contactList.get(id));
	}
	
	@PostMapping("/all")
	public ResponseEntity<?> createNewContactList(@RequestBody Map<String, Object> request){
		if((request.get("id"))==null){
			return ResponseEntity.internalServerError().body("No ID Found!");
		}
		
		if (contactList.get((int) request.get("id")) != null) {
			return ResponseEntity.badRequest().body("ID already Exists!");
		}
		
		int id = (int) request.get("id");
		contactList.put(id, request);
		log.info("New contact added {}", contactList.get(id));
		return ResponseEntity.ok(contactList.get(id));
	}
}
