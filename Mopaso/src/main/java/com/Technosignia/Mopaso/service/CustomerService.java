package com.Technosignia.Mopaso.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import java.util.*;


import com.Technosignia.Mopaso.entity.Customer;
import com.Technosignia.Mopaso.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	public Customer createCustomer(Customer customer)
	{
		return customerRepository.save(customer);
	}
	
	public Customer GetCustomer(Long id)
	{
		Optional<Customer>obj=customerRepository.findById(id);
		Customer Cust=obj.get();
		return Cust; 
	}
	
	public Customer updateCustomer(Customer customer, Long id)
	{
		Optional<Customer>obj=customerRepository.findById(id);
		Customer Cust=obj.get();
		Cust.setAge(customer.getAge());
		Cust.setGender(customer.getGender());
		return customerRepository.save(Cust);
	}
	
	public String deleteCustomer(Long id)
	{
		Optional<Customer>obj=customerRepository.findById(id);
		Customer Cust=null;
		if(obj.isPresent())
		{
	     Cust=obj.get();
		customerRepository.deleteById(id);
		return" Record deleted sucessfully...!";
	    }
		else
		{
			return "Record is apsent..!";
		}

    }
}
