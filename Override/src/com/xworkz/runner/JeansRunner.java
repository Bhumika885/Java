package com.xworkz.runner;

import com.xworkz.internal.Jeans;

public class JeansRunner {

	public static void main(String[] args) {
		
		Jeans jeans1= new Jeans("h&m", "Slim Fit", 32, "Black", 550, "zara");
		
		Jeans jeans2= new Jeans("urbanic ","Baggy Fit", 32,"Grey", 760,"latefashion");
		
		boolean same=jeans1.equals(jeans2);
		System.out.println("Jeans1 and Jeans2 is :"+same);//false
		
	}

}