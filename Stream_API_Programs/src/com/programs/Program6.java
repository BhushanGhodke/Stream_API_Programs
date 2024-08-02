package com.programs;
// Given a list of integers, find the maximum value and minimum value element present in it using Stream functions?

import java.util.Arrays;
import java.util.List;

public class Program6 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
	
		Integer maxNumber = list.stream().max(Integer::compare ).get();
	
		System.out.println("Maximum number in list :: "+maxNumber);
		
		Integer minNumber = list.stream().min(Integer::compare).get();
		
		System.out.println("Minimum number in list :: "+minNumber);
		

		
	}
}
