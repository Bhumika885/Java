package com.xworkz.internal;

public class DellProvider extends Provider {
	
	public DellProvider(String name,String ceoname) {
		
		super(name,ceoname);
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
