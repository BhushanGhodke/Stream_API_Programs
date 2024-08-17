package com.programs.entity;

public class Employee {

	private Integer id;
	private String name;
	private Integer salary;
	private String post;
	private Integer age;
	private Integer yoj;
	private String gender;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getYoj() {
		return yoj;
	}
	public void setYoj(Integer yoj) {
		this.yoj = yoj;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Employee(Integer id, String name, Integer salary, String post, Integer age, Integer yoj, String gender) {
	
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.post = post;
		this.age = age;
		this.yoj = yoj;
		this.gender = gender;
	}
	
	
}
