package com.xworkz.internal;

public class Saree {

	private String brand;
	private String type;
	private double price;
	private String color;
	private String offer;
	private String seller;

	public Saree(String brand, String type, double price, String color, String offer, String seller) {
		super();
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.color = color;
		this.offer = offer;
		this.seller = seller;
	}

	@Override
	public String toString() {
		return "Saree [brand=" + brand + ", type=" + type + ", price=" + price + ", color=" + color + ", offer=" + offer
				+ ", seller=" + seller + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running a euqals in Saree");

		if (obj != null) {
			if (obj instanceof Saree) {
				Saree saree = (Saree) obj;
				if (this.type.equals(saree.type) && this.price == saree.price && this.offer.equals(saree.offer)) {
					System.out.println("Rhs and Lhs is equal");

				}
			} else {
				System.out.println("Obj is Not a Saree");
			}
		} else {
			System.out.println("Obj is null");
		}
		return super.equals(obj);
	}

}