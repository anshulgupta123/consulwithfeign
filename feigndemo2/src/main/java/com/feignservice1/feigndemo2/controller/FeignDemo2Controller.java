package com.feignservice1.feigndemo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feignservice1.feigndemo2.modal.UserDetails;

@RestController
public class FeignDemo2Controller {
	
	@Autowired
	Environment environment;

	@GetMapping(value = "/v1/getUserDetails")
	public ResponseEntity<Object> getUserDetails() {
		UserDetails userDetails = new UserDetails();
		userDetails.setMobileNumber("8445461833");
		userDetails.setState("UP");
		userDetails.setPort(environment.getProperty("server.port"));
		return new ResponseEntity<>(userDetails, HttpStatus.OK);
	}

	
	/*
	 * @GetMapping("/my-health-check") public ResponseEntity<String> myCustomCheck()
	 * { String message = "Testing my healh check function"; return new
	 * ResponseEntity<>(message, HttpStatus.OK); }
	 */
	 
}
