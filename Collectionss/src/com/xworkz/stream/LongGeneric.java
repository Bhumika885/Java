package com.xworkz.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class LongGeneric {

	public static void main(String[] args) {

		Collection<Long> collection = new ArrayList<Long>();

		collection.add(7989898929L);
		collection.add(1089076506L);
		collection.add(309876524L);
		collection.add(909876869L);
		collection.add(748890765L);
		collection.add(60057890L);
		collection.add(936378965L);
		collection.add(5986667354L);
		collection.add(4108402114L);
		collection.add(3591868323L);

		System.out.println("Before Sorting");
		collection.forEach(ref -> System.out.println("Mobile No: " + ref));

		// ascending
		System.out.println("sorting in Ascending");
		collection.stream().sorted().collect(Collectors.toList())
				.forEach(refrence -> System.out.println("Mobile No :" + refrence));

		// descending
		System.out.println("sorting in Descending");
		collection.stream().sorted((refrence, ref) -> ref.compareTo(refrence)).collect(Collectors.toList())
				.forEach(data -> System.out.println("Mobile No :" + data));
	}

}