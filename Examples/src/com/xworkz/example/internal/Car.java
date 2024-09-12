package com.xworkz.example.internal;

public class Car {
		// Static variable
		static String brand;
		// Static block
		static {
			brand = "Audi";
			
			System.out.println("Static brand=" + brand);
		}

		public static void main(String[] args) {

			System.out.println("Main method");
			System.out.println("Static Variable :" + brand);
		}

	}


