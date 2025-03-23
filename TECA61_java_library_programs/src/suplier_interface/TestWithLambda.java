package suplier_interface;

import java.util.function.Supplier;

public class TestWithLambda {
	public static void main(String[] args) {
		Supplier<String> s = () -> "JAVA";
		int i = s.get().length();
		System.out.println(i);
	}
}
