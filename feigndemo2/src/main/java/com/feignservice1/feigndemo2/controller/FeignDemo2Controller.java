package com.feignservice1.feigndemo2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feignservice1.feigndemo2.modal.UserDetails;

@RestController
public class FeignDemo2Controller {

	@GetMapping(value="/v1/getUserDetails")
	public ResponseEntity<Object> getUserDetails() {
		UserDetails userDetails = new UserDetails();
		userDetails.setMobileNumber("8445461833");
		userDetails.setState("UP");
		return new ResponseEntity<>(userDetails, HttpStatus.OK);
	}
}
