package com.vti.dao;

import java.util.List;

import com.vti.domain.Customer;

public interface CustomerDao {
	Long saveCustomer(Customer customer);

	void updateCustomer(Customer customer);

	void deleteCustomer(Long id);

	Customer findCustomerById(Long id);

	List<Customer> findAllCustomers();
}
