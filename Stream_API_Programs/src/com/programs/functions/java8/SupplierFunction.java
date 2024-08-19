package com.programs.functions.java8;

import java.util.function.Supplier;

public class SupplierFunction {

	public static void main(String[] args) {

		Supplier<String> supplier=()->{
			
			StringBuffer otp = new StringBuffer("");
			
			for(int i=1;i<=5;i++) {
				
				otp.append((int)(Math.random()*10));
			}
			
			return otp.toString();
		};
		
		System.out.println(supplier.get());
	}
}
