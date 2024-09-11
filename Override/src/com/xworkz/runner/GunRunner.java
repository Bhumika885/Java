package com.xworkz.runner;

import com.xworkz.internal.Gun;

public class GunRunner {

	public static void main(String[] args) {
		
		Gun gun= new Gun("G17", "Pistol", 1.5, "India", "6", 2);
		
		Gun gun2= new Gun("G17", "Pistol", 0.5, "Germany", "3", 1);
		
		boolean same=gun.equals(gun2);
		System.out.println("Gun and Gun2 is:"+same);
	}

}