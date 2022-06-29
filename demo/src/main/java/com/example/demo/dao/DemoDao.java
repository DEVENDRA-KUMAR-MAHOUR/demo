package com.example.demo.dao;

import java.util.List;

import com.example.demo.bean.DemoRequest;
import com.example.demo.bean.FinalResponse;



public interface DemoDao {

	DemoRequest add(DemoRequest request);
	int deleteById(int id);
	public List getAll();
	public List getById(int id);
	
int updateById(DemoRequest request);
	 // int getById(int id);
	 
	
}
