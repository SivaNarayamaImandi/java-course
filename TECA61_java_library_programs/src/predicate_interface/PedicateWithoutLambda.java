package predicate_interface;

import java.util.function.Predicate;

public class PedicateWithoutLambda implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		return t % 2 == 0;
	}

	public static void main(String[] args) {
		Predicate<Integer> p = new PedicateWithoutLambda();
		System.out.println(p.test(1234));
	}

}
