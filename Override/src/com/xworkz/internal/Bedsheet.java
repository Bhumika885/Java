package com.xworkz.internal;

public class Bedsheet {
	private String material;
	private String color;
	private int threadCount;
	private char size;
	private int quantity;
	private double price;

	public Bedsheet(String material, String color, int threadCount, char size, int quantity, double price) {
		super();
		this.material = material;
		this.color = color;
		this.threadCount = threadCount;
		this.size = size;
		this.quantity = quantity;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Bedsheet [material=" + material + ", color=" + color + ", threadCount=" + threadCount + ", size=" + size
				+ ", quantity=" + quantity + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running a equals");
		if(obj!=null)
		{
			if(obj instanceof Bedsheet) {
				Bedsheet bedsheet=(Bedsheet)obj;
				if(this.material.equals(bedsheet.material) && this.quantity== bedsheet.quantity && this.price== bedsheet.price)
				{
					System.out.println("Lhs and Rhs is Same");
				
				}
			}else {
				System.out.println("Obj is not BedSheet");
			}
		}else {
			System.out.println("Obj is Null");
		}
		return super.equals(obj);
		
	}
}


