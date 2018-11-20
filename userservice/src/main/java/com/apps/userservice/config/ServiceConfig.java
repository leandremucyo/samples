package com.apps.userservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@RefreshScope
@Service
public class ServiceConfig {

	@Value("${message}")
	private String message = "Default Value";
	@Value("${secret}")
	private String secret = "";

	public String getMessage() {
		return message;
	}
	public String getSecret(){
		return secret;
	}
}
