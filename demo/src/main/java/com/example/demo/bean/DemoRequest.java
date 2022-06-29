package com.example.demo.bean;



public class DemoRequest {
  private String name;
  private int id;
  private String demoDay;
  @Override
       public String toString() {
	   return "DemoRequest [name=" + name + ", id=" + id + ", demoDay=" + demoDay + "]";
              }


       public String getDemoDay() {
	   return demoDay;
       }

       public void setDemoDay(String demoDay) {
	   this.demoDay = demoDay;
       }


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
}
