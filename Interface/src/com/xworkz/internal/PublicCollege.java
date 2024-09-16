package com.xworkz.internal;

public class PublicCollege implements CollegeRule {

	@Override
	public boolean idCard() {
		System.out.println("Execute idCard");
		return true;
	}

	@Override
	public boolean inShirt() {
		System.out.println("Execute inShirt");
		return true;
	}

	@Override
	public boolean shoes() {
		System.out.println("Execute shoes");
		return true;
	}

	@Override
	public String setClgTiming() {
		System.out.println("Execute setClgTiming");
		return null;
	}

	@Override
	public String time() {
		System.out.println("Executed time ");
		return "8Am to 2Pm";
	}

	@Override
	public boolean antiRagging() {
		System.out.println("Executed antiRagging");
		return true;
	}

	@Override
	public boolean smoking() {
		System.out.println("Executed smoking ");
		return false;
	}

	@Override
	public String setDressCode() {
		System.out.println("Execute setDressCode");
		return "Formal & Semi-Formal Only";
	}

	@Override
	public boolean books() {
		System.out.println("Execute  books");
		return true;
	}

	@Override
	public int setLibHours() {
		System.out.println("Execute  setLibHours ");
		return 1;
	}
}