package com.yedam.app.accessingdatajpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	List<Customer> findByFirstName(String name);
	List<Customer> findByLastName(String name);
}
