package com.xworkz.runner;

import com.xworkz.internal.State;

public class StateRunner {

	public static void main(String[] args) {
		
		State state = new State("Tamil Nadu", 38, 80000000, "Tamil", "MK Stalin", "Chennai");
		
		State state2= new State("Kerala", 14, 35000000, "Malayalam", "Pinarayi Vijayan", "Thiruvananthapuram");
		
		
		boolean areEqual=state.equals(state2);
		System.out.println("State and State2 is:"+areEqual);
	}

}