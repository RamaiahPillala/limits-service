package com.ramaiah.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ramaiah.microservices.bean.Configuration;
import com.ramaiah.microservices.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping(path = "/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {
		
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}

}
