package com.programs;

import java.util.Arrays;
import java.util.List;

//Java 8 program to perform cube on list elements and filter numbers greater than 50.
public class Program13 {

	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(4,5,6,7,1,2,3);
		
		 list.stream().map(i->i*i*i).filter(result->result>50).forEach(x->System.out.println(x));
	
		 }
	}
