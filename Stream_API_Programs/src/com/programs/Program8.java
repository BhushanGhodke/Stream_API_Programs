package com.programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

//Find out first non repeated word in given string
public class Program8 {

	public static void main(String[] args) {
		
		String str="Java java object object oriented language";
		
		String firstNonRepeatedWord = Arrays.stream(str.toLowerCase().split(" "))
		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new , Collectors.counting()))
		.entrySet().stream()
		.filter(entry->entry.getValue()==1)
		.map(entry->entry.getKey())
		.findFirst().get();
		
		System.out.println("First non repeated word in string :: "+firstNonRepeatedWord);
		
	}
}
