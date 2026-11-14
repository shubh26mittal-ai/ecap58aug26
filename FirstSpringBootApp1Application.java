package com.excelr;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class FirstSpringBootApp1Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(FirstSpringBootApp1Application.class, args);
	
	  //System.out.println("Hello welcome to Spring boot application");
		
		//A a1 = new A();// not recommneded
		
		A a1 = context.getBean(A.class);
		System.out.println(a1);
	}
	}


