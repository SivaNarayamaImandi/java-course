package function_interface_lambda_expresion;

public class OperationsMain {
	public static void main(String[] args) {
		Operations o=(int a,int b)->
		{
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a/b);
			System.out.println(a%b);
		};
		o.operations(10, 10);
	}
}
//WAPT create thread by using lambda expression and print 
//threas id
//threas name
//threas priority