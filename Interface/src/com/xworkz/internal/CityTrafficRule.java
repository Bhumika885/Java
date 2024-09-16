package com.xworkz.internal;

public class CityTrafficRule implements TrafficRule {

	@Override
	public boolean licence() {
		System.out.println("Execute Licence in CityTrafficRules");
		return true;
	}

	@Override
	public boolean helmet() {
		System.out.println("Execute Helmet in CityTrafficRules");
		return true;
	}

	@Override
	public boolean numberPlate() {
		System.out.println("Execute numberplate in CityTrafficRules");
		return true;
	}

	@Override
	public double speedLimit() {
		System.out.println("Execute numberplate in CityTrafficRules");
		return 50;
	}

	@Override
	public int noOfPeople() {
		System.out.println("Execute noOfPeople in CityTrafficRules");
		return 2;
	}

	@Override
	public boolean indicator() {
		System.out.println("Execute indicator in CityTrafficRules");
		return false;
	}

	@Override
	public boolean insurance() {
		System.out.println("Execute insurance in CityTrafficRules");
		return true;
	}

	@Override
	public boolean seatBelt() {
		System.out.println("Execute seatBelt  in CityTrafficRules");
		return false;
	}

	@Override
	public boolean noSmoking() {
		System.out.println("Execute nosmoking  in CityTrafficRules");
		return true;
	}

	@Override
	public boolean noDrinking() {
		System.out.println("Execute no drinking  in CityTrafficRules");
		return false;
	}

	@Override
	public boolean noParkingInPublicPlace() {
		System.out.println("Execute no parking  in CityTrafficRules");
		return false;
	}

	@Override
	public boolean ambulanceFreePassage() {
		System.out.println("Execute ambulancefreepassage in CityTrafficRules");
		return true;
	}

	@Override
	public boolean hornInSilentZone() {
		System.out.println("Execute useHornInSilentZone");
		return false;
	}

}
