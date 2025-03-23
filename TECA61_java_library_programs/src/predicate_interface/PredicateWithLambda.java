package predicate_interface;

import java.util.function.Predicate;

public class PredicateWithLambda {
	public static void main(String[] args) {
		Predicate<Integer>p=(num)->
		{
			return num%2==0;
		};
		boolean b = p.test(11);
		System.out.println(b);
	}
}
