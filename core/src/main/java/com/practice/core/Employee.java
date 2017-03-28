package com.practice.core;

import org.springframework.stereotype.Component;

import com.practice.core.interfaes.Address;

@Component
public class Employee implements Address {

	@Override
	public String homeAddress() {
		return "Noida";
	}

	@Override
	public String companyAddress() {
		return "Gurgaon";
	}
	
	public String companyAddressThrowing() {
		throw new RuntimeException();
	}
	

}
