package com.cusrRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Customer;

public interface Custrepo extends JpaRepository<Customer, Integer>
{

}
