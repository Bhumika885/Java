package com.xworkz.internal;

public class PublicHospital implements HospitalRule {

	@Override
	public int noOfVisiters() {
		System.out.println("Execute noOfVisiters in PublicHospital");
		return 1;
	}

	@Override
	public String admissionPolicy() {
		System.out.println("Execute a AdmissionPolicy in PublicHospital");
		return "Patients must have vaild id";
	}

	@Override
	public boolean maintainSilence() {
		System.out.println("Execute maintainsilence in PublicHospital");
		return true;
	}
}
