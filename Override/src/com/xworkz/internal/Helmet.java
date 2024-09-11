package com.xworkz.internal;

public class Helmet {
	private String brand;
	private char size;
	private String color;
	private double price;
	private int warranty;
	private String seller;

	public Helmet(String brand, char size, String color, double price, int warranty, String seller) {
		super();
		this.brand = brand;
		this.size = size;
		this.color = color;
		this.price = price;
		this.warranty = warranty;
		this.seller = seller;
	}

	@Override
	public String toString() {
		return "Helmet [brand=" + brand + ", size=" + size + ", color=" + color + ", price=" + price + ", warranty="
				+ warranty + ", seller=" + seller + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running a euqals in Helmet");
		if (obj != null) {
			if (obj instanceof Helmet) {
				Helmet helmet = (Helmet) obj;
				if (this.brand.equals(helmet.brand) && this.price == helmet.price) {
					System.out.println("left and right is Same");
				}
			} else {
				System.out.println("Obj is a Not Helmet");
			}
		} else {
			System.out.println("Obj is Null");
		}
		return super.equals(obj);
	}


}
