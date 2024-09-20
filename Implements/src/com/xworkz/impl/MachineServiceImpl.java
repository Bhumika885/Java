package com.xworkz.impl;

import com.xworkz.interfaces.MachineRepository;
import com.xworkz.interfaces.MachineService;

public class MachineServiceImpl implements MachineService {
	
	private MachineRepository machineRepository;
	
	public MachineServiceImpl(MachineRepository machineRepository) {
		this.machineRepository=machineRepository;
	}
	
	
	@Override
	public void save() {
		if(machineRepository != null) {
			System.out.println("Save is not Null");
			machineRepository.save();
		}else {
			System.out.println("Save is Null");
		}
		
	}

	@Override
	public int update() {
		if(machineRepository != null) {
			int version=machineRepository.update();
			if(version >=1) {
				System.out.println("Updated Status:"+version);
				return version;
				
			}
			else {
				System.out.println("cannot update");
			}
		}
		return 0;
	}

	@Override
	public int delete() {
		if(machineRepository != null) {
			int check=machineRepository.delete();
			if(check >0) {
				System.out.println("Deleted files :"+check);
				return check;
			}
			else {
				System.out.println("Cannot deleted");
			}
		}
		return 0;
	}

	@Override
	public int read() {
		if(machineRepository != null) {
			int r=machineRepository.read();
			if(r >=1) {
				System.out.println("Read Status:"+r);
				return r;
			}else {
				System.out.println("Cannot read");
			}
		}
		return 0;
	}

}