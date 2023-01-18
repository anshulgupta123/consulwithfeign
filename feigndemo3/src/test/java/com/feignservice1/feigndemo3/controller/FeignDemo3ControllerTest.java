package com.feignservice1.feigndemo3.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import com.feignservice1.feigndemo3.modal.ResponseDto;

class FeignDemo3ControllerTest {
	
	
	@Test
	@DisplayName("Testing demo3 controller get user data")
	void testUserName() {
		FeignDemo3Controller feignDemo3Controller = new FeignDemo3Controller();
		ResponseEntity<Object> data = feignDemo3Controller.getUserDataByRestTemplate();
		ResponseDto response = (ResponseDto) data.getBody();
		assertEquals("8445461833", response.getMobileNumber(), "User name does not match");
	}

}
