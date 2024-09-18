package com.xworkz.internal;

public class BangaloreTrafficRule implements TrafficRule {

	@Override
	public String licenceNo() {
		System.out.println("LicenceNo in TrafficRule Dept");
		return "DL34 098765353";

	}

}