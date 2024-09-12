package com.xworkz.example.internal;

//Super Chaining Example
	public class Apple {
		
		private String model;
		private double price;
		
		public Apple(String model, double price)
		{
			this.model=model;
			this.price=price;
			System.out.println("Running in apple");
		}
		
		public void display() {
			System.out.println("Execute in apple");
			System.out.println(this.model);
			System.out.println(this.price);
		}
	}

