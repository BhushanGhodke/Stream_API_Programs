package com.programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

// Find out first non repeated character in given String ?
public class Program7 {
	
	
	public static void main(String[] args) {
	
		String str="Java is Object Oriented Programming Language";
		
		String ch = Arrays.stream(str.split(""))
			.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap :: new , Collectors.counting()))
		.entrySet().stream().filter(entry->entry.getValue()==1)
		.map(entry->entry.getKey()).findFirst().get();
	
		
		System.out.println("First Non Repeated character in string :: "+  ch);
	}

}
