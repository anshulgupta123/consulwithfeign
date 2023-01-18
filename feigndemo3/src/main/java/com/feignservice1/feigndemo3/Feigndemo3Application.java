package com.feignservice1.feigndemo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.feignservice1.feigndemo3.modal.MyConfig;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
@EnableConfigurationProperties(value=MyConfig.class)
public class Feigndemo3Application {

	public static void main(String[] args) {
		SpringApplication.run(Feigndemo3Application.class, args);
	}

}