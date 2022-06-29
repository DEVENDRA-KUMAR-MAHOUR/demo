package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.bean.DemoRequest;
import com.example.demo.bean.FinalResponse;
import com.example.demo.service.DemoServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

@ExtendWith(SpringExtension.class)
@WebMvcTest(value = DemoController.class)
class DemoControllerTest {
	
	@Autowired
    MockMvc mockMvc;

    @MockBean
    private DemoServiceImpl demoServiceImpl;

    @Autowired
    private DemoController demoController;
	
	@Test
	@DisplayName("spring boot application marthod testing")
	void testPost()throws Exception {
		DemoRequest demoRequest = new DemoRequest();
		 FinalResponse expFinalResponse = new FinalResponse();
         expFinalResponse.setStatus(Boolean.TRUE);
         when(demoServiceImpl.add(Mockito.any())).thenReturn(expFinalResponse);
         mockMvc.perform(MockMvcRequestBuilders.post("/add").contentType(MediaType.APPLICATION_JSON)
                                         .content(new ObjectMapper().writeValueAsString(demoRequest)));
         FinalResponse actFinalResponse = demoController.testPost(demoRequest);         
         assertEquals(expFinalResponse, actFinalResponse);    
	}      
	
	@Test
	@DisplayName("spring boot application marthod testing")
	void testgetDemo1()throws Exception {
		 FinalResponse expFinalResponse = new FinalResponse();
         expFinalResponse.setStatus(Boolean.TRUE);
         when(demoServiceImpl.deleteById(1)).thenReturn(expFinalResponse);
         mockMvc.perform(MockMvcRequestBuilders.post("/delete").contentType(MediaType.APPLICATION_JSON)
                                         .content(new ObjectMapper().writeValueAsString(1)));
         FinalResponse actFinalResponse = demoController.deleteDemo(1);         
         assertEquals(expFinalResponse, actFinalResponse);    
	} 
	@Test
	@DisplayName("spring boot application marthod testing")
	void testupdate()throws Exception {
		DemoRequest demoRequest = new DemoRequest();
		 FinalResponse expFinalResponse = new FinalResponse();
         expFinalResponse.setStatus(Boolean.FALSE);
         when(demoServiceImpl.add(Mockito.any())).thenReturn(expFinalResponse);
         mockMvc.perform(MockMvcRequestBuilders.post("/update").contentType(MediaType.APPLICATION_JSON)
                                         .content(new ObjectMapper().writeValueAsString(demoRequest)));
         FinalResponse actFinalResponse = demoController.update(demoRequest);         
         }     
	@Test
	@DisplayName("spring boot application marthod testing")
	void testdemo()throws Exception {
		DemoRequest demoRequest = new DemoRequest();
		 FinalResponse expFinalResponse = new FinalResponse();
         expFinalResponse.setStatus(Boolean.FALSE);
         when(demoServiceImpl.add(Mockito.any())).thenReturn(expFinalResponse);
         mockMvc.perform(MockMvcRequestBuilders.post("/getAll").contentType(MediaType.APPLICATION_JSON)
                                         .content(new ObjectMapper().writeValueAsString(demoRequest)));
         FinalResponse actFinalResponse = demoController.demo();         
         }     
	
	     
	@Test
	@DisplayName("spring boot application marthod testing")
	void testgetDemo()throws Exception {
		DemoRequest demoRequest = new DemoRequest();
		 FinalResponse expFinalResponse = new FinalResponse();
         expFinalResponse.setStatus(Boolean.FALSE);
         when(demoServiceImpl.add(Mockito.any())).thenReturn(expFinalResponse);
         mockMvc.perform(MockMvcRequestBuilders.post("/getById").contentType(MediaType.APPLICATION_JSON)
                                         .content(new ObjectMapper().writeValueAsString(demoRequest)));
         FinalResponse actFinalResponse = demoController.getDemo(23);         
         }     
}      