package com.programs.functions.java8;

import java.util.function.BiConsumer;
// BiConsumer accept two parameter and return nothing
public class BiConsumerFunction {

	public static void main(String[] args) {
		
		BiConsumer<String, String> str=(a,b)->{
			
			System.out.println(a + b);
		};
		
		str.accept("Java", " FullStack Developer");
	}
}
