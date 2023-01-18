package com.feignservice1.feigndemo3.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * @FeignClient(name = "feigndemo2", url = "http://localhost:8082") public
 * interface FeignDemo2Proxy {
 * 
 * @GetMapping(value = "/v1/getUserDetails") public ResponseEntity<Object>
 * getUserDetails();
 * 
 * }
 */

@FeignClient(name = "feigndemo2")
public interface FeignDemo2Proxy {
	@GetMapping(value = "/v1/getUserDetails")
	public ResponseEntity<Object> getUserDetails();

}
