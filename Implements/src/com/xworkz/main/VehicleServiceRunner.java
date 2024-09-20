package com.xworkz.main;


import com.xworkz.impl.VehicleRepositoryImpl;
import com.xworkz.impl.VehicleServiceImpl;
import com.xworkz.interfaces.VehicleRepository;
import com.xworkz.interfaces.VehicleService;

public class VehicleServiceRunner {

	public static void main(String[] args) {
		
		
		VehicleRepository repository= new VehicleRepositoryImpl();
		
		VehicleService service= new VehicleServiceImpl(repository);
		service.persist();
		System.out.println("----------");
		service.merge();
		System.out.println("----------");
		boolean ref=service.clear();
		System.out.println("Clear :"+ref);
		System.out.println("----------");
		String search=service.search();
		System.out.println("Search :"+search);

	}

}