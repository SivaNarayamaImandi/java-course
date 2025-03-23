package org;

public class A {
	protected int a = 10;

	protected void displaly() {
		System.out.println("HAI");
	}

	protected A(int a) {
		System.out.println("JAVA");
	}

	public static void main(String[] args) {
		A a = new A(5);
		System.out.println(a.a);
		a.displaly();
	}
}
