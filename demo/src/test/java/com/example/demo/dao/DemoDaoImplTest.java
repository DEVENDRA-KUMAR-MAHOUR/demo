package com.example.demo.dao;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.bean.DemoRequest;
@ExtendWith(SpringExtension.class)
@SpringBootTest
class DemoDaoImplTest {
     @Autowired
     DemoDaoImpl dao;
    
	@Test
	void testadd() { 
		 DemoRequest request= new DemoRequest();
		 request.setId(23);
		 request.setName("learning");
		 request.setDemoDay("2th day");
		 JdbcTemplate jdbcTemplate= Mockito.mock(JdbcTemplate.class);
		 when(jdbcTemplate.update(anyString())).thenReturn(23);
		 dao.add(request);
		 }
	@Test
	void testdeleteById() { 
		 JdbcTemplate jdbcTemplate= Mockito.mock(JdbcTemplate.class);
		 when(jdbcTemplate.update(anyString())).thenReturn(24);
		 dao.deleteById(24);
		 }
	@Test
	void testupdateById() { 
		 DemoRequest request= new DemoRequest();
		 request.setId(23);
		 request.setName("learning");
		 request.setDemoDay("2th day");
		 JdbcTemplate jdbcTemplate= Mockito.mock(JdbcTemplate.class);
		 when(jdbcTemplate.update(anyString())).thenReturn(24);
		 dao.updateById(request);
		 }
	@Test
	void testgetAll() { 
		 DemoRequest request= new DemoRequest();
		List<DemoRequest> list=new ArrayList<DemoRequest>();
	
		 JdbcTemplate jdbcTemplate= Mockito.mock(JdbcTemplate.class);
		 when(jdbcTemplate.update(anyString())).thenReturn(24);
		 dao.getAll();
		 }
	@Test
	void testgetById() { 
		 DemoRequest request= new DemoRequest();
		List<DemoRequest> list=new ArrayList<DemoRequest>();
		 request.setId(23);
		 request.setName("learning");
		 request.setDemoDay("2th day");
		 JdbcTemplate jdbcTemplate= Mockito.mock(JdbcTemplate.class);
		 when(jdbcTemplate.update(anyString())).thenReturn(23);
		 dao.getById(23);
		 }
}
