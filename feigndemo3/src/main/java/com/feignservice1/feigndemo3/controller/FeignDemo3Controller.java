package com.feignservice1.feigndemo3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.feignservice1.feigndemo3.feign.FeignDemo2Proxy;
import com.feignservice1.feigndemo3.modal.ResponseDto;

@RestController
public class FeignDemo3Controller {

	@Autowired
	FeignDemo2Proxy feignDemo2Proxy;

	@GetMapping(value = "/v1/getUserData")
	public ResponseEntity<Object> getUserData() {
		ResponseEntity<Object> response = feignDemo2Proxy.getUserDetails();
		ObjectMapper objectMapper = new ObjectMapper();
		ResponseDto responseDto = objectMapper.convertValue(response.getBody(), ResponseDto.class);
		responseDto.setUserId(1l);
		return new ResponseEntity<>(responseDto, HttpStatus.OK);
	}
	
	}
