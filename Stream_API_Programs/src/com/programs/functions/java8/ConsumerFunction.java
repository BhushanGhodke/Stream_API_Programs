package com.programs.functions.java8;

import java.util.function.Consumer;

public class ConsumerFunction {

	public static void main(String[] args) {
		

		Consumer<String> consumer1=(i)->{
			
			System.out.println(i+ " Full Stack");
		};
		
		Consumer<String> consumer2=(i)->{
		
		System.out.println(i +" Java Developer");
		};
		
		consumer1.andThen(consumer2).accept("Bhushan");
		
	}
}
