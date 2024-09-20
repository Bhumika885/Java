package com.xworkz.main;

import com.xworkz.impl.AddressRepositoryImpl;
import com.xworkz.impl.AddressServiceImpl;
import com.xworkz.interfaces.AddressRepository;
import com.xworkz.interfaces.AddressService;

public class AddressServiceRunner {

	public static void main(String[] args) {

		AddressRepository repository = new AddressRepositoryImpl();

		AddressService service = new AddressServiceImpl(repository);
		boolean check = service.push();
		System.out.println(check);
		System.out.println("----------");
		int no = service.refresh();
		System.out.println(no);
		System.out.println("----------");

		service.remove();
		System.out.println("----------");

		String msg = service.load();
		System.out.println(msg);
	}

}