package com.programs;

import java.util.Arrays;
import java.util.List;

// Given the list of integers, find the first element of the list using Stream functions?
public class Program4 {

	public static void main(String[] args) {
		
		   List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);

		   Integer firstNumber = list.stream().findFirst().get();
	
		   System.out.println("First Number In List :: "+firstNumber);
	}
}
