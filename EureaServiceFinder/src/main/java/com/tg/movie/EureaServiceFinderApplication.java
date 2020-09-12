package com.tg.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EureaServiceFinderApplication {

	public static void main(String[] args) {
		SpringApplication.run(EureaServiceFinderApplication.class, args);
	}

}
