package com.xworkz.runner;

import com.xworkz.internal.Kettle;

public class KettleRunner {

	public static void main(String[] args) {
		
		
		Kettle kettle= new Kettle("Havells", 1.5, "stainless Steel", "Black", 650, 1);
		
		Kettle kettle2= new Kettle("Prestige", 1.7,"Ceramic","White", 800, 1);
		
		boolean compare=kettle.equals(kettle2);
		System.out.println("Kettle and Kettle2 is :"+compare);//false
	}

}