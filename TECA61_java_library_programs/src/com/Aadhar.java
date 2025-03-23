package com;

public class Aadhar {
	public String name;
	public int age;
	public char gender;
	public int mobile;
	public String address;
	public static Aadhar a = null;

	public Aadhar(String name, int age, char gender, int mobile, String address) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.mobile = mobile;
		this.address = address;
		display();
	}

	private void display() {
		System.out.println("Aadhr holder name : " + name);
		System.out.println("Aadhr holder age : " + age);
		System.out.println("Aadhr holder gender : " + gender);
		System.out.println("Aadhr holder mobile number : " + mobile);
	}

	public static void createAadhr() {
		if (a == null) {
			a = new Aadhar("SIVA", 23, 'M', 1234567, "HYD");
			System.out.println("AADHAR CREATED.......");
		} else {
			System.out.println("ALREADY AADHAR CREATED.......");
		}
	}
}
