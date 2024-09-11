package com.xworkz.runner;

import com.xworkz.internal.Grinder;

public class GrinderRunner {

	public static void main(String[] args) {
		
		Grinder grinder1 = new Grinder("Bosch", 18400, "ACGM-DS500W3J", 2, "Black", 2);
		
		Grinder grinder2= new Grinder("Prestige", 18400, " ACGM-AMEO", 1,"Red", 2);
		
		boolean compare=grinder1.equals(grinder2);
		System.out.println("Grinder 1 and Grinder2 is : "+compare);
	}

}
