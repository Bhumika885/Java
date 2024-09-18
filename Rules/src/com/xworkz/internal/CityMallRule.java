package com.xworkz.internal;

public class CityMallRule implements MallRule {

	@Override
	public boolean validId() {
		System.out.println("Execute valid Id in City Mall Rule");
		return true;
	}

}