package org;

public class Demo1 {
	private int a = 10;

	private void display() {
		System.out.println("HAI");
	}

	private Demo1() {
		System.out.println("JAVA");
	}

	public static void main(String[] args) {
		Demo1 d = new Demo1();
		System.out.println(d.a);
		d.display();
	}
}
