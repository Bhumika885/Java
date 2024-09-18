package com.xworkz.internal;

public class MallManagement {

	private MallRule mallRule;

	public MallManagement(MallRule mallRule) {
		this.mallRule = mallRule;
	}

	public void shopping() {
		System.out.println("Execute shopping in Mall Management");

		if (mallRule != null) {
			System.out.println("mall Rule is not null");
			boolean verified = mallRule.validId();
			if (verified) {
				System.out.println("It is a Valid Id");
			}
		} else {
			System.out.println("Mall rule is Null");
		}
	}

}