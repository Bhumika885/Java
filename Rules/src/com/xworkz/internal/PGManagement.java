package com.xworkz.internal;

public class PGManagement {

	private PGRule pgRule;

	public PGManagement(PGRule pgRule) {
		this.pgRule = pgRule;
	}

	public void check() {
		System.out.println("Execute a check in Pg management");

		if (pgRule != null) {
			System.out.println("Pg rule is  Not Null");

			pgRule.costPerMonth();
			boolean available = pgRule.wifi();
			if (available) {
				System.out.println("Wifi is Available in Pg");
			}
		} else {
			System.out.println("Pg rule is null");
		}
	}

}