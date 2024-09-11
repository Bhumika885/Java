package com.xworkz.internal;

public class Bulb {
	private String brand;
	private int watt;
	private String color;
	private String type;
	private double price;
	private String seller;

	public Bulb(String brand, int watt, String color, String type, double price, String seller) {
		super();
		this.brand = brand;
		this.watt = watt;
		this.color = color;
		this.type = type;
		this.price = price;
		this.seller = seller;
	}

	@Override
	public String toString() {
		return "Bulb [brand=" + brand + ", watt=" + watt + ", color=" + color + ", type=" + type + ", price=" + price
				+ ", seller=" + seller + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running Equals in Bulb");
		if(obj !=null) {
			if(obj instanceof Bulb) {
				Bulb bulb=(Bulb)obj;
				if(this.brand.equals(bulb.brand) && this.color.equals(bulb.color) && this.price==bulb.price) {
					System.out.println("Lhs and Rhs is Same");
					
				}
			}else {
				System.out.println("Obj is not a Bulb");
			}
		}else {
			System.out.println("Obj is Null");
		}
		return super.equals(obj);
	}

}
	


