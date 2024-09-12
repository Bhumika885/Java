package com.xworkz.example.internal;

public class Vessel {
		// Example of Compile-Time Polymorphism
		public void store(int capacity) {
			System.out.println("Running in vessel");
			System.out.println(capacity);
		}

		// Method overloading is a example of compile-time polymorphism

		public void store(String name) {
			System.out.println("Running a Store in String vessel");
			System.out.println(name);
		}
		
	}	

