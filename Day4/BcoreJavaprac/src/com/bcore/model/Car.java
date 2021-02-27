package com.bcore.model;

public class Car {
	String model;
	String color;
	int noOfWheel;
	String engineType;
	double price;
	String carType;
	int speed;
	int gearnumber;
	
	public void accerlarate(int nu) {
		speed = speed + nu;
	}
}
