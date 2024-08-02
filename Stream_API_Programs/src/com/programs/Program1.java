package com.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Given a list of integers, find out all the even numbers
*that exist in the list using Stream functions?
*/
public class Program1 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,25,18,54,68,124,47,26,59,54,77);
		

		List<Integer> even  = list.stream().filter(x->x%2==0).collect(Collectors.toList());
	
		System.out.println("Even Number :: "+even);
		
		List<Integer> odd = list.stream().filter(x->x%2!=0).collect(Collectors.toList());
	
		System.out.println("Odd Number :: "+odd);
	}
}
