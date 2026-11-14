package com.excelr.FirstSpringContainerApp;

public class Student {
	
	

	//POJO class
	
		private int rollno;
		private String name;
		private String email;
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Student(int rollno, String name, String email) {
			super();
			this.rollno = rollno;
			this.name = name;
			this.email = email;
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
		@Override
		public String toString() {
			return "Student [rollno=" + rollno + ", name=" + name + ", email=" + email + "]";
		}
		
		
	}


