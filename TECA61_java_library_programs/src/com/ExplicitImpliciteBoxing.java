package com;

public class ExplicitImpliciteBoxing {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		int i = 10;
		Integer j = new Integer(i);
		System.out.println("EXPLICIT BOXING IN FORM OF OBJECT : "+j);
		
		Integer k = i;
		System.out.println("IMPLICIT BOXING IN FORM OF OBJECT : "+k);
	}
}
