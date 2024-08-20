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
		
		Immutable_Class im= new Immutable_Class("5673 8788 9889");
		
	    String adhar = im.getAdharNo();
	    
	    System.out.println(adhar);

	    
	}
	
}
