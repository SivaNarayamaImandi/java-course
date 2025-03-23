package suplier_interface;

import java.util.Random;
import java.util.function.Supplier;

public class TestWithoutLambda implements Supplier<Random>{

	@Override
	public Random get() {
		return new Random();
	}
	public static void main(String[] args) {
		Supplier<Random> s=new TestWithoutLambda();
		int i = s.get().nextInt(1234);
		System.out.println(i);
	}

}
