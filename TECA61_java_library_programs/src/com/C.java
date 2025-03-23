package com;

import org.A;

public class C extends A {
	public C()
	{
		super(15);
	}
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.a);
		c.displaly();
	}
}
