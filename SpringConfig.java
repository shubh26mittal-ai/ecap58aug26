package com.excelr.DepInjectionUsingAnnotation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class SpringConfig {
	@Bean
	public Address getAdd()
	{
		//setter injections
		Address a1 = new Address();
		a1.setHouseNo(101);
		a1.setCity("Chennai");
		a1.setPincode(123456);
		return a1;
	}
	
	
	@Bean
	public Student getStd()
	{
		Student s1 = new Student();
		s1.setRollno(1);
		s1.setName("Sham");
		s1.setEmail("sham@gmail.com");
		
		return s1;
	}
	
}


