package com.programs.functions.java8;

import java.util.function.Predicate;

import com.programs.entity.Person;

//To combine multiple predicate we use predicate joining
// 1) test == abstract method
// 2) negate 3) and  4) or  these four method available

public class PredicateJoining {

	
	public static boolean isPersonEleigibleForMembership(Person person, Predicate predicate) {
		
	   return predicate.test(person);
		
	}
	public static void main(String[] args) {

        
		Person person= new Person("alex", 25);
		
		Predicate<Person> gretaerThanEighteen= (p) -> p.age > 18;
		
		Predicate<Person> lessThanSixty= (p) -> p.age < 60 ; 
		
		Predicate<Person> predicate=gretaerThanEighteen.or(lessThanSixty);
		
		boolean status = isPersonEleigibleForMembership(person, predicate);
		
		System.out.println(status);
	}

	

	}

