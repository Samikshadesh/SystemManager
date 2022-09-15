package com.Technosignia.Mopaso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Technosignia.Mopaso.entity.Customer;
import com.Technosignia.Mopaso.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/customer")
	public Customer createCustomer(@RequestBody Customer customer)
	{
		return customerService.createCustomer(customer);
	}
	
	@GetMapping("/customer")
	public  Customer GetCustomerdetails(@RequestParam Long id)
	{
		return customerService.GetCustomer(id);
	}
	
	@PutMapping("/customer")
	public Customer updateCustomerdetails(@RequestBody Customer customer,@RequestParam Long id)
	{
		return customerService.updateCustomer(customer,id);
	}
	
	@DeleteMapping("/customer/{id}")
	public String deleteCustomerdetails(@PathVariable Long id)
	{
		return customerService.deleteCustomer(id);
	}
	

}
