package com.feignservice1.feigndemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Feigndemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Feigndemo2Application.class, args);
	}

}
