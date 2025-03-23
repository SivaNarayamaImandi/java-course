package org;

class X {
	int a = 10;

	void display() {
		System.out.println("HI");
	}

	X() {
		System.out.println("JAVA");
	}

	public static void main(String[] args) {
		X x = new X();
		System.out.println(x.a);
		x.display();
	}
}
