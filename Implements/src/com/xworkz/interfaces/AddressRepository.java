package com.xworkz.interfaces;


public interface AddressRepository {
	
	boolean save();
	
	int update();
	
	void delete();
	
	String read();

}