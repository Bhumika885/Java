package com.xworkz.impl;


import com.xworkz.interfaces.AddressRepository;
import com.xworkz.interfaces.AddressService;

public class AddressServiceImpl implements AddressService {

	private AddressRepository addressRepository;

	public AddressServiceImpl(AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}

	@Override
	public boolean push() {
		if (addressRepository != null) {
			boolean saved = addressRepository.save();
			if (saved) {
				System.out.println("Saved Successfully" + saved);
				return true;
			}
		} else {
			System.out.println("Failed");
		}
		return false;
	}

	@Override
	public int refresh() {
		if (addressRepository != null) {
			int ver = addressRepository.update();
			if (ver >1) {
				System.out.println("Updated Status" + ver);
				return ver;
			}
		} else {
			System.out.println("cannot Update");
		}
		return 0;

	}

	@Override
	public void remove() {
		if (addressRepository != null) {
			System.out.println("address Repository is Not Null");
			addressRepository.delete();
		} else {
			System.out.println("address Repository is Null");
		}

	}

	@Override
	public String load() {
		if (addressRepository != null) {

			addressRepository.read();
			return "Success";
		} else {
			System.out.println("address Repository is Null");
		}
		return "Failed";
	}

}