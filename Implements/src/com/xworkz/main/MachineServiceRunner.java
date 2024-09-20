package com.xworkz.main;


import com.xworkz.impl.MachineRepositoryImpl;
import com.xworkz.impl.MachineServiceImpl;
import com.xworkz.interfaces.MachineRepository;
import com.xworkz.interfaces.MachineService;

public class MachineServiceRunner {

	public static void main(String[] args) {
		
		MachineRepository repository= new MachineRepositoryImpl();
		
		MachineService service= new MachineServiceImpl(repository);
		service.save();
		System.out.println("----------");
		int num=service.update();
		System.out.println("Updated :"+num);
		System.out.println("----------");
		int i=service.delete();
		System.out.println("Deleted:"+i);
		System.out.println("----------");
		int read=service.read();
		System.out.println("Readed:"+read);
	}

}
