package com.xworkz.runner;

import com.xworkz.internal.CityMallRule;
import com.xworkz.internal.MallManagement;
import com.xworkz.internal.MallRule;

public class MallRunner {

	public static void main(String[] args) {
		
		MallRule mallRule=new CityMallRule();
		
		MallManagement management= new MallManagement(mallRule);
		management.shopping();

	}

}