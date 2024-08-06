package com.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//How to count each element/word from the String ArrayList in Java8?
public class Program16 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("AA","BB","AA","CC","Ram");
		
		Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	
		System.out.println(collect);
	}
}
