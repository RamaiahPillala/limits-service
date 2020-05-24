package com.ramaiah.microservices.bean;

public class LimitConfiguration {
	private int maximum;
	private int min;

	protected LimitConfiguration() {

	}

	public LimitConfiguration(int maximum, int min) {
		super();
		this.maximum = maximum;
		this.min = min;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

}
