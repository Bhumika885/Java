package com.xworkz.impl;

import com.xworkz.interfaces.VehicleRepository;
import com.xworkz.interfaces.VehicleService;

public class VehicleServiceImpl implements VehicleService {
	
	private VehicleRepository vehicleRepository;
	
	
	public VehicleServiceImpl(VehicleRepository vehicleRepository) {
		this.vehicleRepository= vehicleRepository;
	}
	
	
	@Override
	public void persist() {
		if(vehicleRepository != null) {
			System.out.println("Save is not null");
			vehicleRepository.save();
		}else {
			System.out.println("Save is null");
		}
		
	}

	@Override
	public void merge() {
		if(vehicleRepository != null) {
			System.out.println("Update is not Null");
			vehicleRepository.update();
		}else {
			System.out.println("Update is Null");
		}
		
	}

	@Override
	public boolean clear() {
		if(vehicleRepository != null) {
			boolean deleted=vehicleRepository.delete();
			if(deleted) {
				System.out.println("Deleted Succesfully");
				return true;
			}else {
				System.out.println("Not Deleted");
			}
		}
		return false;
	}

	@Override
	public String search() {
		if(vehicleRepository != null) {
			vehicleRepository.read();
			return "Completed";
			
		}else {
			System.out.println("Read is null");
		}
		return "Not Read";
	}

}