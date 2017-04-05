package com.practice.core;

import org.springframework.stereotype.Component;

import com.practice.core.interfaes.Address;

@Component
public class Student implements Address {

	@Override
	public String homeAddress() {
		return "Hathras";
	}

	@Override
	public String companyAddress() {
		return "Noida";
	}

}
