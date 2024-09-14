package com.xworkz.internal;

public class SatjioInternetProvider extends JioInternetProvider {

private double cost;
private String launchDate;

public SatjioInternetProvider(String name, String ceoName,double cost,String launchDate) {
	super(name, ceoName);
	this.cost=cost;
	this.launchDate=launchDate;
	
}

@Override
public void use() {
    System.out.println("......");
}

@Override
public void main() {
    System.out.println("=====");
}

@Override
public String toString() {
	return "SatjioInternetProvider [cost=" + cost + ", launchDate=" + launchDate + ", toString()=" + super.toString()+ "]";
}
}
