package org;

public class Test {
	public int a = 10;

	public void display() {
		System.out.println("HI");
	}

	public Test() {
		System.out.println("JAVA");
	}

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.a);
		t.display();
	}
}
