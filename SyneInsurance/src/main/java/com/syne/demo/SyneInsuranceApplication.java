package com.syne.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SyneInsuranceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SyneInsuranceApplication.class, args);
	}

}
