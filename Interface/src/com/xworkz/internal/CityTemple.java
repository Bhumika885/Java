package com.xworkz.internal;

public class CityTemple implements TempleRule {

	@Override
	public String openingTime() {
		System.out.println("......");
		return "8Am";
	}

	@Override
	public String closingTime() {
		System.out.println("......");
		return "8Pm";
	}

	@Override
	public boolean KeepSilence() {
		System.out.println("......");
		return true;
	}

	@Override
	public String prayerTime() {
		System.out.println("......");
		return "8:30Am To 9:30Pm";
	}

	@Override
	public String donationPolicy() {
		System.out.println("......");
		return "Temple Maintenance";
	}

	@Override
	public String dressCode() {
		System.out.println("......");
		return "Traditonal";
	}

	@Override
	public String visitorRule() {
		System.out.println("......");
		return "Keep silent into the Temple";
	}

	@Override
	public boolean noPhones() {
		System.out.println("......");
		return true;
	}

	@Override
	public boolean noCamera() {
		System.out.println("......");
		return true;
	}

	@Override
	public boolean guide() {
		System.out.println("......");
		return true;
	}

}