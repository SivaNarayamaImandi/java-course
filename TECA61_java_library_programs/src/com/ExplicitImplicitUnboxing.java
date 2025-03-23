package com;

public class ExplicitImplicitUnboxing {
	public static void main(String[] args) {
		char l = 'a';
		Character m = l;

		char c = m.charValue();
		System.out.println("EXPLICIT UNBOXING IN FORM OF PRIMITIVE DATA : " + c);

		char d = m;
		System.out.println("IMPLICIT UNBOXING IN FORM OF PRIMITIVE DATA : " + d);
	}
}
