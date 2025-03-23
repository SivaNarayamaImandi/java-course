package function_interface_lambda_expresion;

public class StringPalidromMain {
	public static void main(String[] args) {
		StringPalidrom sp=(String a) ->
		{
			String rev="";
			for (int i = a.length() - 1; i >= 0; i--) {
				char c = a.charAt(i);
				rev += c;
			}
			if(rev.equals(a))
				System.out.println("PALIDROM");
			else
				System.out.println("NOT A PALIDROM");
		};
		sp.stringPalidrom("bob");
	}
}
