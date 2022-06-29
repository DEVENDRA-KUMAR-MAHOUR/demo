package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.bean.DemoRequest;
import com.example.demo.bean.FinalResponse;
import com.example.demo.service.DemoService;

@RequestMapping
@RestController
public class DemoController {

	@Autowired
	
	private DemoService demoService;
	
	// getting all demo 
	@GetMapping("/getAll")
	public FinalResponse demo() {
		
		return  demoService.getAll();
	}
	
	@GetMapping("/getById/{id}")
	public FinalResponse getDemo(@PathVariable int id) {
		System.out.println(id);
		return  this.demoService.getById( id);
	}

	/*@GetMapping("/get/{id}")
	public FinalResponse demoget(int id) {
		
		return  this.demoService.get(id);
	}*/

	@PostMapping("/add")
	public FinalResponse testPost(@RequestBody  DemoRequest request) {
		
		return demoService.add(request);
	}
	//delete by id 
	@DeleteMapping("/delete/{id}")
	public FinalResponse deleteDemo(@PathVariable int id) {
		System.out.println(id);
		return demoService.deleteById(id);
	}

	@PostMapping("/update/{id}")
	public FinalResponse update(@RequestBody  DemoRequest request) {
		
		return demoService.updateById(request);
	}
	
}
