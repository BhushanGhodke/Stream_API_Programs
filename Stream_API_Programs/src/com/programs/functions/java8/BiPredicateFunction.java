package com.programs.functions.java8;

import java.util.function.BiPredicate;
// In predicate takes only one parameter but BiPredicate Takes Two parameter and return status true or false
public class BiPredicateFunction {

	public static void main(String[] args) {
		
		BiPredicate<String, Integer> biPredicate= (i,j)->{
			return i.length()==j;
		};
		
		boolean status = biPredicate.test("Alex",6);
	
        boolean status1 = biPredicate.test("Alex", 4);
		
        System.out.println(status);
        System.out.println(status1);
	}
}
