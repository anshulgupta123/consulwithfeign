package com.feignservice1.feigndemo3.controller;

import java.text.MessageFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.feignservice1.feigndemo3.feign.FeignDemo2Proxy;
import com.feignservice1.feigndemo3.modal.MyConfig;
import com.feignservice1.feigndemo3.modal.ResponseDto;

@RestController
public class FeignDemo3Controller {

	Logger logger = LoggerFactory.getLogger(FeignDemo3Controller.class);

	@Autowired
	FeignDemo2Proxy feignDemo2Proxy;
	
	@Autowired
	MyConfig myConfig;
	

	@GetMapping(value = "/v1/getUserData")
	public ResponseEntity<Object> getUserData() {
		logger.info("Inside getUserData of FeignDemo3Controller");
		ResponseDto responseDto = null;
		try {
			ResponseEntity<Object> response = feignDemo2Proxy.getUserDetails();
			ObjectMapper objectMapper = new ObjectMapper();
			responseDto = objectMapper.convertValue(response.getBody(), ResponseDto.class);
			responseDto.setUserId(1l);
			responseDto.setPassword(myConfig.getPassword());
			responseDto.setUserName("anshul.kumar");
		} catch (Exception e) {
			String errorMsg = MessageFormat.format("Exception caught in getUserData of FeignDemo3Controller :{0}", e);
			logger.error(errorMsg);
		}
		return new ResponseEntity<>(responseDto, HttpStatus.OK);

	}

	@GetMapping(value = "/v1/getUserDataByRestTemplate")
	public ResponseEntity<Object> getUserDataByRestTemplate() {
		logger.info("Inside getUserDataByRestTemplate of FeignDemo3Controller");
		ResponseDto responseDto = null;
		try {
			ResponseEntity<ResponseDto> response = new RestTemplate()
					.getForEntity("http://localhost:8082/v1/getUserDetails", ResponseDto.class);
			responseDto = response.getBody();
			responseDto.setUserId(1l);
		} catch (Exception e) {
			String errorMsg = MessageFormat
					.format("Exception caught in getUserDataByRestTemplate of FeignDemo3Controller :{0}", e);
			logger.error(errorMsg);
			e.printStackTrace();

		}
		return new ResponseEntity<>(responseDto, HttpStatus.OK);
	}
}
