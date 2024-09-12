package com.xworkz.example.internal;

public class Employee {
	//Example of OverLoading

		private String name;
		private int age;
		private int salary;

		public Employee() {
			System.out.println("No args Constructor");
		}
		
		public Employee(String name) {
			this.name=name;
			System.out.println("One string args constructor");
		}
		
		public Employee(String name, int age, int salary)
		{
			this.name=name;
			this.age=age;
			this.salary=salary;
			System.out.println("Three args constructor");
		}

	}


