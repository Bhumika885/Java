package com.xworkz.internal;

public class Kettle {
	private String brand;
	private double capacity;
	private String material;
	private String color;
	private double price;
	private int warranty;
	
	public Kettle(String brand, double capacity, String material, String color, double price, int warranty) {
		super();
		this.brand = brand;
		this.capacity = capacity;
		this.material = material;
		this.color = color;
		this.price = price;
		this.warranty = warranty;
	}
	
	@Override
	public String toString() {
		return "Kettle [brand=" + brand + ", capacity=" + capacity + ", material=" + material + ", color=" + color
				+ ", price=" + price + ", warranty=" + warranty + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running  Equals in Kettle");
		if (obj != null) {
			if (obj instanceof Kettle) {
				Kettle casted = (Kettle) obj; // casting
				if (this.brand.equals(casted.brand) && this.price == casted.price && this.capacity == casted.capacity ) {
					System.out.println("Lhs and Rhs is Equal");

				}
			} else {
				System.out.println("Obj is not a Jeans");
			}
		} else {
			System.out.println("Obj is  null");
		}
		
	
		return super.equals(obj);
	}

}


