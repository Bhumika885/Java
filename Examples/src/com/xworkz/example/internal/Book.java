package com.xworkz.example.internal;

public class Book {
	//example of InstanceBlock

		String name;
		int price;

		{
			name = "Alchemist";
			price = 200;
			System.out.println("Name" + name);
			System.out.println("Price " + price);
		}
		//constructor
		public Book() {
			System.out.println("Creating a Book with no args");
		}
		
		public static void main(String[] main)
		{
			System.out.println("Running main method");
			System.out.println("...");
			
			Book book= new Book();
			System.out.println("...");
			Book book2= new Book();
		}

	}

