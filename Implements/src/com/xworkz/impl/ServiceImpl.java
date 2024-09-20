package com.xworkz.impl;

import com.xworkz.interfaces.Repository;
import com.xworkz.interfaces.Service;

public class ServiceImpl implements Service {
	
	private Repository repository;
	
	public ServiceImpl(Repository repository) {
		this.repository= repository;
		System.out.println("repository parameter in ServiceImpl Constructor");
	}
	

	@Override
	public String push() {
		System.out.println("Execute a push in Service Impl");
		if(repository != null) {
			boolean saved=repository.save();
			if(saved) {
				System.out.println("Saved in Repository");
				return "Success";
			}
		}else {
			System.out.println("Not Saved");
			return "Failed";
		}
		
		return "Some Issues";
	}

}