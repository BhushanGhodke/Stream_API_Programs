package com.programs;

public class Notes {

	private Integer id;
	private String name;
	private Integer page;
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
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Notes(Integer id, String name, Integer page) {
		super();
		this.id = id;
		this.name = name;
		this.page = page;
	}
	
	
}
