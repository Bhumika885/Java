package com.xworkz.internal;

public class LenovoProvider extends Provider {
	private int profit;
	
	public LenovoProvider(String name,String ceoname) {
		super(name,ceoname);
		this.profit=profit;
	}
	
	@Override
	public String toString() {
		return "LenovoProvider [profit=" + profit + ", toString()=" + super.toString() + "]";
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

