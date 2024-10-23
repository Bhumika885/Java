package com.xworkz.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class PrimeMinister {

	public static void main(String[] args) {

		Collection<String> collection = new ArrayList<String>();

		collection.add("Narendra Modi");
		collection.add("Jawaharlal Nehru");
		collection.add("Lal Bahadur Shastri");
		collection.add("Atal Bihari Vajpayee");
		collection.add("H. D. Deve Gowda");
		collection.add("Manmohan Singh");
		collection.add("Indira Gandhi");
		collection.add("Rajiv Gandhi");
		collection.add("Vishwanath Pratap Singh");
		collection.add("Chandra Shekhar");
		collection.add("P. V. Narasimha Rao");

		System.out.println("Before Sorting");
		collection.forEach(each -> System.out.println("Prime Minister : " + each));

		// Ascending
		System.out.println("Sorting in Ascending");
		collection.stream().sorted().collect(Collectors.toList())
				.forEach(each1 -> System.out.println("Prime Minister : " + each1));
		// descending
		System.out.println("Sorting in Descending");
		collection.stream().sorted((each, each1) -> each1.compareTo(each))
				.forEach(ref -> System.out.println("Prime Minister :" + ref));
	}

}