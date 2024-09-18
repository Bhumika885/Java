package com.xworkz.internal;

public class RoadSafetyDepartment {

	private TrafficRule trafficRule;

	public RoadSafetyDepartment(TrafficRule trafficRule) {
		this.trafficRule = trafficRule;
	}

	public void use() {

		System.out.println("Execute use in Banglore Traffic Rule");
		if (trafficRule != null) {

			System.out.println("Traffic Rule is not Null");
			trafficRule.licenceNo();

		} else {
			System.out.println("Traffic Rule is Null");
		}
	}

}