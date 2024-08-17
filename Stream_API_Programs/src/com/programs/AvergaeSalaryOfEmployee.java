package com.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.programs.entity.Employee;

public class AvergaeSalaryOfEmployee {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee(1, "John", 50000, "Developer", 30, 2018, "Male"),
				new Employee(2, "Jane", 60000, "Manager", 35, 2015, "Female"),
				new Employee(3, "Sameer", 75000, "Senior Developer", 33, 2016, "Male"),
				new Employee(4, "Javahack", 80000, "Lead Developer", 45, 2010, "Male"));
	
	
		Double avgSalary = employees.stream().collect(Collectors.averagingDouble(Employee::getSalary));
	
		System.out.println("Average Salary of Employee  :: "+avgSalary);
	}
}
