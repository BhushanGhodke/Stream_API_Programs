package com.programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

//How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?
public class Program15 {

	public static void main(String[] args) {
		
		   List<Notes> noteLst = new ArrayList<>();
		    noteLst.add(new Notes(1, "note1", 11));
		    noteLst.add(new Notes(2, "note2", 22));
		    noteLst.add(new Notes(3, "note3", 33));
		    noteLst.add(new Notes(4, "note4", 44));
		    noteLst.add(new Notes(5, "note5", 55));

		    noteLst.add(new Notes(6, "note4", 66));
		    
		    
		   LinkedHashMap<String, Integer> collect = noteLst.stream().sorted(Comparator.comparing(Notes:: getPage).reversed())
		   .collect(Collectors.toMap(Notes ::getName,Notes :: getPage, (old, newValue)->old, LinkedHashMap:: new ));
		   
		   System.out.println(collect);
		     
		    
	}
}



