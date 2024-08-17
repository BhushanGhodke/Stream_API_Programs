package com.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.programs.entity.Employee;

public class SecondHighestSalary {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee(1, "John", 50000, "Developer", 30, 2018, "Male"),
				new Employee(2, "Jane", 60000, "Manager", 35, 2015, "Female"),
				new Employee(3, "Sameer", 75000, "Senior Developer", 33, 2016, "Male"),
				new Employee(4, "Javahack", 80000, "Lead Developer", 45, 2010, "Male"));
	
	
		Employee employee = employees.stream().sorted(Comparator.comparing(Employee:: getSalary).reversed()).skip(1).findFirst().get();
	
		System.out.println("Second Highest Salary :: "+employee.getSalary());
	}
}
