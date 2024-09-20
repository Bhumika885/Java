package com.xworkz.main;

import com.xworkz.impl.RepositoryImpl;
import com.xworkz.impl.ServiceImpl;
import com.xworkz.interfaces.Repository;
import com.xworkz.interfaces.Service;

public class ServiceRunner {

	public static void main(String[] args) {

		Repository repo = new RepositoryImpl();

		Service ser = new ServiceImpl(repo);
		String ref = ser.push();
		System.out.println("Push :" + ref);
	}

}