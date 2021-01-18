package com.example.springcloudserverconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudServerConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServerConfigApplication.class, args);
	}

}
