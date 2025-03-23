package MajorOperatorsInJava;

public class ArithmaticOperations 
{

	public static void main(String[] args) 
	{
		/*1. Arithmetic Operators (+,-,/,%,*)
		
		ASCII values:-
		'0' - '9' -- 48-57
		'A' -'Z' -- 65-90
		'a' -'z' -- 97-122
		*/
		
		  System.out.println(4+3);
		  System.out.println('A'-10);
		  System.out.println('a'+'b');
		  System.out.println("hello"+10);
		  System.err.println(10+20+"helo");
		  System.out.println("hello"+20+50);
		  System.out.println(10+20+"hello"+40+50);
		  System.out.println("hello"+(10+20));
		  System.out.println("hello"+'A');
		  System.out.println('A'+'B'+"hello");
		  System.out.println(10+'a'+"hello");
		  
		  /* System.out.println(10+false);
		  System.out.println('A'+true);
		  System.out.println('A'+10+false);
		  System.out.println(true+false);
		  System.out.println(false-false);
		  System.out.println(true-false);
		  */
		  
		  System.out.println("hello"+true);
		  System.out.println("hello"+false+true);
		  
		  //System.out.println(false+true+"hello");
		  //System.out.println("hello"*10);
		  
		  System.out.println('A'*10);

	}

}