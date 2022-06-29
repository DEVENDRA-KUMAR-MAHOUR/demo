package com.example.demo.bean;

public class Demo {
	  public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDemoDay() {
		return demoDay;
	}
	public void setDemoDay(String demoDay) {
		this.demoDay = demoDay;
	}
	private int id;
	  public Demo(int id, String name, String demoDay) {
		super();
		this.id = id;
		this.name = name;
		this.demoDay = demoDay;
	}
	private String name;
	  private String demoDay;
	@Override
	public String toString() {
		return "Demo [id=" + id + ", name=" + name + ", demoDay=" + demoDay + "]";
	}
	  
	  
}
