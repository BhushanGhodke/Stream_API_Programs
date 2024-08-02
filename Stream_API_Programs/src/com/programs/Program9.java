package com.programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

// Given a String, find the first repeated character in it using Stream functions?
public class Program9 {

	public static void main(String[] args) {
		
		String str="Java is object oriented programming language";
		
		String ch = Arrays.stream(str.toLowerCase().split(""))
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap :: new, Collectors.counting()))
		.entrySet().stream()
		.filter(entry->entry.getValue()>1)
		.map(entry->entry.getKey())
		.findFirst().get();
	
		System.out.println("First repeated characted in String :: "+ch);
	}
}
