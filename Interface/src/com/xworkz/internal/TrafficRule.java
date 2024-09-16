package com.xworkz.internal;

public interface TrafficRule {
	boolean noSmoking();

	boolean noDrinking();

	boolean helmet();

	boolean seatBelt();

	boolean licence();

	boolean numberPlate();

	int noOfPeople();

	boolean indicator();

	double speedLimit();

	boolean hornInSilentZone();

	boolean ambulanceFreePassage();

	boolean insurance();

	boolean noParkingInPublicPlace();

}
