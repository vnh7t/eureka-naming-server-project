package com.project2.microservices.eurekanamingserverproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaNamingServerProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaNamingServerProjectApplication.class, args);
	}

}
