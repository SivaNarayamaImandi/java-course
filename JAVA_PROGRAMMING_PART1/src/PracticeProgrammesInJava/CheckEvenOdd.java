package PracticeProgrammesInJava;

public class CheckEvenOdd 
{

	public static void main(String[] args) 
	{
		// write a program to check given number is Even or Odd
		
		  int e = 99;
		  int rem = e%2;
		  String result = (rem==0)?"Even":"Odd";
		  System.out.println(e+ " is an "+result+" number");

	}

}