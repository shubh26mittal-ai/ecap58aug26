package com.excelr.DepInjectionUsingJavaConfigSetterInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Springconfig {

//	@Bean
//	public Address getAdd() {
//		// setter injection
//		Address a1 = new Address();
//		a1.setHouseNo(101);
//		a1.setCity("chennai");
//		a1.setPincode(123456);
//		return a1;
//	}
//
//	@Bean
//	public Student getstd() {
//		Student s1 = new Student();
//		s1.setRollno(1);
//		s1.setName("Sham");
//		s1.setEmail("sham@gmail.com");
//		s1.setAddress(getAdd()); // dependency injection
//		return s1;
//	}
	//constructor injections
	@Bean
	public Address getAdd()
	{
	    Address a = new Address(123, "Bengaluru",123456);
	    return a;
	}
	@Bean
	public Student getStd()
	{
		Student s = new Student (1,"Shubh","Shubh@gmail.com",getAdd());
		return s;
	}
}
