package com.core.java;

// Write a program for immutable class

public final class Immutable_Class {

	final String adharNo;
	
	
	public Immutable_Class(String adharNo) {
		this.adharNo=adharNo;
	
	}
	
	public String getAdharNo() {
		return adharNo;
	}
	
	
	public static void main(String[] args) {
		
		Immutable_Class im= new Immutable_Class("8888 8888 2525");
		
	    String adhar = im.getAdharNo();
	    
	    System.out.println(adhar);

	    
	}
	
}
