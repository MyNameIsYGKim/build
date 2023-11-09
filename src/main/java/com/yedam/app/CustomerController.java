package com.yedam.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.yedam.app.accessingdatajpa.Customer;
import com.yedam.app.accessingdatajpa.CustomerRepository;

@RestController	// Controller, ResponseBody
public class CustomerController {
	
	@Autowired CustomerRepository repo;
	
	@GetMapping("/")
	public ModelAndView main() {
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("greet", "<b>안녕</b>하세요");
		return mv;
	}
	
	@GetMapping("/customer")
	public Iterable<Customer> findall(){
		return repo.findAll();
	}
}
