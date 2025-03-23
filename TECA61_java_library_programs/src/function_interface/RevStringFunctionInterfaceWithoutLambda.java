package function_interface;

import java.util.function.Function;

public class RevStringFunctionInterfaceWithoutLambda implements Function<String, String> {

	@Override
	public String apply(String t) {
		String rev = "";
		for (int i = t.length() - 1; i >= 0; i--)
			rev += t.charAt(i);
		return rev;
	}

	public static void main(String[] args) {
		Function<String, String> f = new RevStringFunctionInterfaceWithoutLambda();
		System.out.println(f.apply("JAVA"));
	}

}
