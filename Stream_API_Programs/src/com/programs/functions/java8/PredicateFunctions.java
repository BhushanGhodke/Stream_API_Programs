package com.programs.functions.java8;

import java.util.function.Predicate;

// Predicate it is used to perform conditional check return true or false value

public class PredicateFunctions {

	public static void main(String[] args) {
		
		Predicate<Integer> p =i -> i > 10;
		
	//	System.out.println(p.test(40));  return true 40 > 10 
		
	//	System.out.println(p.test(5));  return false 5 > 10
		
		
		
		Predicate<String> str =s->s.toLowerCase().charAt(0)== 'k';

		
		String []names= {"Kamlesh", "Kiran", "Kajal","Abhijit", "John","Tom" };
		
		for(String name:names) {
			if(str.test(name)) {
				System.out.println(name);
			}
		}
	}
}
