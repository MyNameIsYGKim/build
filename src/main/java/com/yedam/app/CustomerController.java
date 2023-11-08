package com.yedam.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.app.accessingdatajpa.Customer;
import com.yedam.app.accessingdatajpa.CustomerRepository;

@RestController	// Controller, ResponseBody
public class CustomerController {
	
	@Autowired CustomerRepository repo;
	
	@GetMapping("/customer")
	public Iterable<Customer> findall(){
		return repo.findAll();
	}
}
