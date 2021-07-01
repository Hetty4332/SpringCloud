package com.example.SpringCloudProject2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudProject2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudProject2Application.class, args);
	}

}
