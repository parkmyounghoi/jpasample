package com.mh.org.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mh.org.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	List<Customer> findByLastName(String lastName);

	Customer findById(long id);

}