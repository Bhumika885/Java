package com.xworkz.runner;

import com.xworkz.internal.Helmet;

public class HelmetRunner {

	public static void main(String[] args) {
		
		Helmet helmet= new Helmet("Steelbird", 'M', "Black", 6000, 2, "Thh");
		
		Helmet helmet2=new Helmet("RoyalEnfield", 'S', "Grey", 5500, 2, "Bell");
		
		boolean same=helmet.equals(helmet2);
		System.out.println("Helmet and helmet2 is "+same);
	}

}