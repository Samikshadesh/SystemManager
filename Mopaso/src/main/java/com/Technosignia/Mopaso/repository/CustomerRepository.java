package com.Technosignia.Mopaso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Technosignia.Mopaso.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
