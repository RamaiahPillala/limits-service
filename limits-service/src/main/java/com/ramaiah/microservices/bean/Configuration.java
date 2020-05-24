package com.ramaiah.microservices.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ConfiurationProperties annatation would be used for fetching data
 * from application.properties file
 * @author ramai
 *
 */


@Component
@ConfigurationProperties("limits-service")
public class Configuration {
	private int minimum;
	private int maximum;
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maxmimum) {
		this.maximum = maxmimum;
	}
	

}
