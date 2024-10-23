package com.xworkz.stream;


import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class States {

	public static void main(String[] args) {

		Collection<String> collection = new ArrayList<String>();

		collection.add("West Bengal");
		collection.add("Sikkim");
		collection.add("Rajasthan");
		collection.add("Punjab");
		collection.add("Odisha");
		collection.add("Nagaland");
		collection.add("Mizoram");
		collection.add("Meghalaya");
		collection.add("Manipur");
		collection.add("Maharashtra");
		collection.add("Madhya Pradesh");
		collection.add("Kerala");
		collection.add("Karnataka");
		collection.add("Jharkhand");
		collection.add("Himachal Pradesh");
		collection.add("Haryana");
		collection.add("Arunachal Pradesh");
		collection.add("Andhra Pradesh");
		collection.add("Tamil Nadu");
		collection.add("Telangana");
		collection.add("Tripura");
		collection.add("Gujarat");
		collection.add("Goa");
		collection.add("Chhattisgarh");
		collection.add("Bihar");
		collection.add("Assam");
		collection.add("Uttar Pradesh");
		collection.add("Uttarakhand");

		System.out.println("Before Sorting");
		collection.forEach(state -> System.out.println(state));

		// Ascending
		System.out.println("Sorting in Ascending");
		collection.stream().sorted().collect(Collectors.toList()).forEach(states -> System.out.println(states));
		// descending
		System.out.println("Sorting in Descending");
		collection.stream().sorted((state, states) -> states.compareTo(state)).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));
	}

}