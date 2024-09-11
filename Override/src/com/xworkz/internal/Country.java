package com.xworkz.internal;

public class Country {
	private String name;
	private int noOfState;
	private int noOfPopulation;
	private String primeMinister;
	private int establishedYear;
	private int countryPin;

	public Country(String name, int noOfState, int noOfPopulation, String primeMinister, int establishedYear,
			int countryPin) {
		super();
		this.name = name;
		this.noOfState = noOfState;
		this.noOfPopulation = noOfPopulation;
		this.primeMinister = primeMinister;
		this.establishedYear = establishedYear;
		this.countryPin = countryPin;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", noOfState=" + noOfState + ", noOfPopulation=" + noOfPopulation
				+ ", primeMinister=" + primeMinister + ", establishedYear=" + establishedYear + ", countryPin="
				+ countryPin + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running a equals in Country");
		if(obj!=null) {
			if(obj instanceof Country) {
				Country country=(Country)obj;
				if(this.name.equals(country.name) && this.noOfState==country.noOfState) {
					System.out.println("left and right is Same");
				}
			}else {
				System.out.println("Obj is a Country");
			}
		}else {
			System.out.println("Obj is Null");
		}
		return super.equals(obj);
		
	}


}
