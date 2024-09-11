package com.xworkz.runner;

import com.xworkz.internal.Saree;

public class SareeRunner {

	public static void main(String[] args) {
		
		Saree saree1= new Saree("banarasi ","Silk" , 999, "White", "5%","bandhni");
		
		Saree saree2= new Saree("chikankari", "Silk", 890, "pink","5%", "tant");
		
		boolean equal=saree1.equals(saree2);
		System.out.println("Saree1 and Saree2 is :"+equal);
	}

}