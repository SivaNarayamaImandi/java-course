package function_interface_lambda_expresion;

public class StringRevMain {
	public static void main(String[] args) {
		StringRev s = (String a) -> {
			String rev = "";
			for (int i = a.length() - 1; i >= 0; i--) {
				char c = a.charAt(i);
				rev += c;
			}
			System.out.println(rev);
		};
		s.stringRev("JAVA");
	}
}
