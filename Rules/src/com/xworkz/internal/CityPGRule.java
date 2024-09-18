package com.xworkz.internal;

public class CityPGRule implements PGRule{
	
	@Override
	public double costPerMonth() {
		System.out.println("Execute cost per month in city pg");
		return 10000;
	}

	@Override
	public boolean wifi() {
		System.out.println("Execute wifi in city pg");
		return true;
	}
}