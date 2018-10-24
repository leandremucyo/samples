package com.apps.confsvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AppsConfigurationServer {

	public static void main(String[] args) {
		SpringApplication.run(AppsConfigurationServer.class, args);
	}

}
