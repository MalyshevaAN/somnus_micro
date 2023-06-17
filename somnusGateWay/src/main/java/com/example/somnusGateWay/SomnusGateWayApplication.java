package com.example.somnusGateWay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableDiscoveryClient
@CrossOrigin(origins = "http://localhost:3000")
public class SomnusGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SomnusGateWayApplication.class, args);
	}

}
