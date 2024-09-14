package com.xworkz.internal;

public class MovieBookingProvider extends BookingProvider {
	
	public MovieBookingProvider(String name,String ceoname) {
		
		super(name,ceoname);
	}


public void book() {
	System.out.println(",,,,,");
}

public void cancel() {
	System.out.println(";;;;;");
}
	
@Override
public void use() {
    System.out.println("......");
}

@Override
public void main() {
    System.out.println("=====");
}


}

