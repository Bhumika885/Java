package com.xworkz.runner;

import com.xworkz.internal.CityPGRule;
import com.xworkz.internal.PGRule;
import com.xworkz.internal.PGManagement;

public class PGRunner {

	public static void main(String[] args) {
		
		PGRule pgRule= new CityPGRule();
		
		PGManagement management= new PGManagement(pgRule);
                 management.check();
		
	}

}