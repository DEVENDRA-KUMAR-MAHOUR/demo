package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.bean.DemoRequest;
import com.example.demo.bean.FinalResponse;
import com.example.demo.dao.DemoDaoImpl;
@ExtendWith(SpringExtension.class)
@SpringBootTest
class DemoServiceImplTest {

	 private static final String Null = null;
	
	@Mock
	 private DemoDaoImpl dao;
	 @InjectMocks
	 private DemoServiceImpl service;
	

	@Test
	void testadd() {
		DemoRequest expResquest= new DemoRequest();
		when(dao.add(any())).thenReturn(expResquest);
		FinalResponse add = service.add(expResquest);
		assertNotNull(add);
       
	
	}
	@Test
	void testdeleteById() {
		FinalResponse response= new FinalResponse();;
	DemoRequest expList=new DemoRequest();
	expList.setId(1);
	expList.setName("learning");
	expList.setDemoDay("2 day");
	response.setData(expList);
	response.setMessage(Null);
	response.setStatus(true);
	List<DemoRequest> list=new ArrayList<DemoRequest>();
		when(dao.deleteById(anyInt())).thenReturn(1);
		FinalResponse deleteById = service.deleteById(1);
		assertNotNull(deleteById);
       
	
	}
	@Test
	void testupdateById() {
	 
		DemoRequest expResquest= new DemoRequest();
		when(dao.updateById(any())).thenReturn(23);
		FinalResponse update= service.updateById(expResquest);
		assertNotNull(update);
	}	
	@Test
	void testupdateByIdElse() {
	 
		DemoRequest expResquest= new DemoRequest();
		when(dao.updateById(any())).thenReturn(0);
		FinalResponse update= service.updateById(expResquest);
		assertNotNull(update);
	}
	
	@Test
	void testgetAll() {
		DemoRequest expResquest= new DemoRequest();
	
	
		List<DemoRequest> list=new ArrayList<DemoRequest>();
		when(dao.add(any())).thenReturn(expResquest);
		FinalResponse getAll= service.getAll();
		assertNotNull(getAll);
	}
	@Test
	void testgetById() {
		FinalResponse response= new FinalResponse();
		DemoRequest expList=new DemoRequest();
		expList.setId(1);
		expList.setName("learning");
		expList.setDemoDay("2 day");
		response.setData(expList);
		response.setMessage(Null);
		response.setStatus(true);
		List<DemoRequest> list=new ArrayList<DemoRequest>();
		when(dao.getById(anyInt())).thenReturn(list);
		FinalResponse getId= service.getById(1);
		assertNotNull(getId);
	}
}