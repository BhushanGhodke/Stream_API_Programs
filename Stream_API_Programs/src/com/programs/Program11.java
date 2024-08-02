package com.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
public class Program11 {

	
	
	
	public static void main(String[] args) {
		
		int []a= {1,2,1,5};
		
		List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
	
		Set<Integer> set = new HashSet<>(list);
	
		System.out.println(set.size());
		System.out.println(list.size());
		
	}
}
