package com.xworkz.collection.associate;


import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Supplier;

public class FunctionalInt {

	public void isConsumer(Consumer<Boolean> consumer) {
		System.out.println("Execute a Consumer in Functional Int");
		if(consumer != null) {
			System.out.println("Consumer is not null");
			consumer.accept(true);
		}
		else {
			System.out.println("Consumer is null");
		}
	}
	
	public void show(BiConsumer<String, Integer> biConsumer) {
		System.out.println("Execute a Biconsumer in Functional Int");
		if(biConsumer !=null) {
			System.out.println("biConsumer is not Null");
			biConsumer.accept("Osama", 20);
		}else {
			System.out.println("biConsumer is Null");
		}
	}
	
	public void supply(Supplier<Boolean> supplier) {
		System.out.println("Execute a Supplier in Functional Int");
		if(supplier!=null) {
			System.out.println("supplier is not null");
			boolean supply=supplier.get();
			System.out.println("Supplier result: "+supply);
		}else {
			System.out.println("supplier is null");
		}
	}
	
	public void function(Function<Integer, String> function) {
		System.out.println("Execut a Function in Functional Int");
		if(function != null) {
			System.out.println("function is not null");
			function.apply(null);
		}else {
			System.out.println("function is null");
		}
		
	}
	
	public void biFunction(BiFunction<Integer, Integer, String> biFunction) {
		 System.out.println("Execute a bi function in Functional Int");
		 if(biFunction !=null) {
			 System.out.println("biFunction is null");
			 biFunction.apply(null, null);
		 }else {
			 System.out.println("bi Function is null");
		 }
	}
	
	

	public void isConsumer(IntConsumer consumer1) {
		System.out.println("Execute a IntConsumer method in Functional Int");
		if (consumer1 != null) {
			System.out.println("consumer1 is not null");
			consumer1.accept(42); // Example of using the consumer with a value
		} else {
			System.out.println("Consumer is null");
		}
	}
}