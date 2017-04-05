package com.practice.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runnner {
	
	public static void main(String[] args) {
		
			ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ParentConfig.class);
			Employee employee  = applicationContext.getBean(Employee.class);
			System.out.println(employee.homeAddress());
			Student student  = applicationContext.getBean(Student.class);
			System.out.println(student.homeAddress());
	}
	
}
