package com;

public class Customer {
	public String name;
	public int age;
	public int mobile;
	public char gender;
	public String address;
	public String fatherName;
	public static Customer c=null;
	public Customer(String name, int age, int mobile, char gender, String address, String fatherName) {
		this.name = name;
		this.age = age;
		this.mobile = mobile;
		this.gender = gender;
		this.address = address;
		this.fatherName = fatherName;
		
	}
	public void display()
	{
		System.out.println("NAME OF THE CUSTOMER : "+name);
		System.out.println("AGE OF THE CUSTOMER : "+age);
		System.out.println("MOBILE NUMBER OF CUSTOMER : "+mobile);
		System.out.println("GENDER OF THE CUSTOMER : "+gender);
		System.out.println("ADDRESS OF THE CUSTOMER : "+address);
		System.out.println("FATHER NAME OF THE CUSTOMER : "+fatherName);
	}
	
}
