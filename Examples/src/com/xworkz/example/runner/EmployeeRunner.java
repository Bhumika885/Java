package com.xworkz.example.runner;


import com.xworkz.example.internal.Employee;

public class EmployeeRunner {

	public static void main(String[] args) {
		
		Employee employee= new Employee();
		System.out.println("------");
		
		Employee employee1= new Employee("Ramesh");
		System.out.println("-------");
		
		Employee employee2= new Employee("Suresh", 35, 50000);

	}

}