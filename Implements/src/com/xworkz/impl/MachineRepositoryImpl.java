
package com.xworkz.impl;



import com.xworkz.interfaces.MachineRepository;

public class MachineRepositoryImpl implements MachineRepository{

	@Override
	public void save() {
		System.out.println("Save in MachineRepositoryImpl");
		
	}

	@Override
	public int update() {
		System.out.println("Update in MachineRepositoryImpl");
		return 1;
	}

	@Override
	public int delete() {
		System.out.println("Delete in MachineRepositoryImpl");
		return 7;
	}

	@Override
	public int read() {
		System.out.println("Read in MachineRepositoryImpl");
		return 5;
	}
	
	

}