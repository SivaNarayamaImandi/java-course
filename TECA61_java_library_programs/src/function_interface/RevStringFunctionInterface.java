package function_interface;

import java.util.function.Function;

public class RevStringFunctionInterface {
	public static void main(String[] args) {
		Function<String, String> f = (str) -> {
			String rev = "";
			for (int i = str.length() - 1; i >= 0; i--)
				rev += str.charAt(i);
			return rev;
		};
		String s = f.apply("JAVA");
		System.out.println(s);
	}
}
