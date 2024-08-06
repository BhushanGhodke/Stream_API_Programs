package com.programs;

import java.util.Arrays;

// Write a Java 8 program to sort an array and then convert the sorted array into Stream?
public class Program14 {

	public static void main(String[] args) {
		
		 int arr[] = { 99, 55, 203, 99, 4, 91 };
		 
	//	 Arrays.parallelSort(arr);
		 
		 Arrays.stream(arr).boxed().sorted().  forEach(x->System.out.println(x));
		 
		 
	}
}
