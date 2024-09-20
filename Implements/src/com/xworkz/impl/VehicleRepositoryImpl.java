
package com.xworkz.impl;

import com.xworkz.interfaces.VehicleRepository;

public class VehicleRepositoryImpl implements VehicleRepository {

	@Override
	public void save() {
		System.out.println("save in VehicleRepository Impl");
		
	}

	@Override
	public void update() {
		System.out.println("update in VehicleRepository Impl");
		
	}

	@Override
	public boolean delete() {
		System.out.println("Delete in VehicleRepository Impl");
		return true;
	}

	@Override
	public String read() {
		System.out.println("Read in VehicleRepository Impl");
		return "readed";
	}

}
