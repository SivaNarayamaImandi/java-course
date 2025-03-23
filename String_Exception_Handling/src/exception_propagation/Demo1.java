package exception_propagation;

public class Demo1 {
	public static void main(String[] args) {
		try {
			divide(10, 0);
			System.out.println("PROGRAM STOPED OR TERMINATED DUE TO DENOMINATOR '0'");
		} catch (ArithmeticException e) {
			// TODO: handle exception
		}
	}
	public static void divide(int a,int b)
	{
		System.out.println(a/b);
	}
}
