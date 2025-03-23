package function_interface_lambda_expresion;

public class EvenOddMain {
	public static void main(String[] args) {
		EvenOdd eo = (int a) -> {
			if (a % 2 == 0)
				System.out.println("EVEN");
			else
				System.out.println("ODD");
		};
		eo.evenOdd(13);
	}
}