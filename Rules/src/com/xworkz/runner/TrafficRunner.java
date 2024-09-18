package com.xworkz.runner;

import com.xworkz.internal.BangaloreTrafficRule;
import com.xworkz.internal.RoadSafetyDepartment;
import com.xworkz.internal.TrafficRule;

public class TrafficRunner {

	public static void main(String[] args) {
		
		TrafficRule trafficRule= new BangaloreTrafficRule();
		
		RoadSafetyDepartment roadSafety= new RoadSafetyDepartment(trafficRule);
		roadSafety.use();
		
	}

}