package com.programs;

import java.util.Arrays;
import java.util.List;

// Given a list of integers, sort all the values present in it using Stream functions?
public class Program10 {

	public static void main(String[] args) {
		
		List<Integer> list =Arrays.asList(10,54,25,68,78,29,97,58,24);
		
		System.out.print("List in Ascending Order ::  ");
		list.stream().sorted().forEach(x->System.out.print(x+ " "));
		
		System.out.println();
		
		System.out.print("List in Descending Order:: ");
		list.stream().sorted((a,b)->b.compareTo(a)).forEach(x->System.out.print(x+" "));
		
		
		
		
	}
}
