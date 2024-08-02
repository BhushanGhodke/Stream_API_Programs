package com.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 *  Given a list of integers, find out all the numbers starting with 1 using Stream functions?
 */

public class Program2 {

	public static void main(String[] args) {
		  List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
	
		  List<String> numberList = list.stream().map(x-> x+ "").filter(x->x.startsWith("1")).collect(Collectors.toList());
		 
		  System.out.println("Numbers Strat With 1  :: "+numberList);
	}
	
}
