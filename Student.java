package com.excelr.DepInjectionUsingXmlSetterInjection;

public class Student {
	
	private int rollno;
	private String name;
	private String email;
	private Address address;//take reference of another class to this class to do dependency injections
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollno, String name, String email, Address address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", email=" + email + ", address=" + address + "]";
	}
	
	

}
