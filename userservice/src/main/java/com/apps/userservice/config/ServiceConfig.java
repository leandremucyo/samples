package com.apps.userservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceConfig {

	@Value("${message}")
	private String message = "Default Value";

	public String getMessage() {
		return message;
	}
}
