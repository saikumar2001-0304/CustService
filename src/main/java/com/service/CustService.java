package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Dto.CustDto;
import com.cusrRepo.Custrepo;
import com.entity.Customer;

@Service
public class CustService 
{
	@Autowired
	Custrepo custrepo;
	
	
	public Custrepo getCustrepo() {
		return custrepo;
	}


	public void setCustrepo(Custrepo custrepo) {
		this.custrepo = custrepo;
	}


	public Customer create(CustDto co)
	{
		Customer ct=new Customer(co.getName(), co.getPassword());
		return custrepo.save(ct);
	}
}
