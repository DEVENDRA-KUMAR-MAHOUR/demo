package com.example.demo.service;






import com.example.demo.bean.DemoRequest;
import com.example.demo.bean.FinalResponse;




public interface DemoService {
	
	public FinalResponse add(DemoRequest request);
public FinalResponse deleteById(int id);
public FinalResponse getAll();

public FinalResponse updateById(DemoRequest request);
public FinalResponse getById(int id);
//public FinalResponse get(int id);

}
