package com.apps.userservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@RefreshScope
@Service
public class ServiceConfig {

	@Value("${message}")
	private String success = "OK";
	@Value("${message}")
	private String secret = "";

	public String getSuccess() {
		return this.success;
	}
	public String getSecret(){
		return secret;
	}
}
