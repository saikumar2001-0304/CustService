package com.cusrController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Dto.CustDto;
import com.entity.Customer;
import com.service.CustService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(path="/cust")
public class CustController {

	@Autowired
	CustService ser;
	
	
	public CustService getSer() {
		return ser;
	}


	public void setSer(CustService ser) {
		this.ser = ser;
	}

	@GetMapping(path="/save")
	public ResponseEntity<String> createCust(@Valid @RequestBody CustDto dto, BindingResult res )
	{
		if(res.hasErrors())
		{
			return ResponseEntity.badRequest().body("Validation Failed");
		}
		ser.create(dto);
		return ResponseEntity.ok("User created successfully");
	}
}
