package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.bean.DemoRequest;
import com.example.demo.bean.FinalResponse;
import com.example.demo.dao.DemoDao;





@Service
public class DemoServiceImpl implements DemoService {
	@Autowired
	
	public DemoDao demoDao;
		
	@Override
	public FinalResponse add(DemoRequest request) {
		FinalResponse response= new FinalResponse();
		try {
			DemoRequest demoDetail = demoDao.add(request);
		response.setData(demoDetail);
		response.setMessage("Data Inserted successfully");
		response.setStatus(true);
		}
		catch (Exception e) {
			response.setData(null);
			response.setMessage(e.getMessage());
			response.setStatus(false);
		}
		return response;
		
		
	}

	@Override
	public FinalResponse deleteById(int id) {
		FinalResponse response= new FinalResponse();
		try
		{
			int deleteById = demoDao.deleteById(id);
			if(deleteById!=0)
			{
				response.setData(deleteById);
				response.setMessage("Data Deleted successfully");
				response.setStatus(true);
			}
			
		}
		catch (Exception e) {
			response.setData(null);
			response.setMessage("some error occured");
			response.setStatus(false);
		}
		return response;
	}

	
	



	@Override
	public FinalResponse getAll() {
		FinalResponse response= new FinalResponse();
		
			List list = demoDao.getAll();
		response.setData(list);
		response.setMessage("Data Inserted successfully");
		response.setStatus(true);
		return response ;
		
	}

	public FinalResponse updateById(DemoRequest request) {
		
		
		FinalResponse response = new FinalResponse();

		try {
		int updateById = demoDao.updateById(request);
			if (updateById != 0) {
				response.setData(updateById);
				response.setMessage("Successfully Update");
				response.setStatus(true);
			} else {
				response.setData(null);
				response.setMessage("Sorry Data is not update !!");
				response.setStatus(false);
			}
		} catch (Exception e) {
			response.setMessage(e.getMessage());
		}

		
		return response;
		
		
	}

	@Override
	public FinalResponse getById(int id) {
		FinalResponse response= new FinalResponse();
		try
		{
		  List getById = demoDao.getById(id);
			if(getById.size()!=0)
			{
				response.setData(getById);
				response.setMessage("Data  successfully find");
				response.setStatus(true);
			}
			
		}
		catch (Exception e) {
			response.setData(null);
			response.setMessage("some error occured");
			response.setStatus(false);
		}
		return response;
	}

	/*@Override
	public FinalResponse get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
*/
	


}
