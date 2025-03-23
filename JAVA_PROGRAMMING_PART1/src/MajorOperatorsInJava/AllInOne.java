package MajorOperatorsInJava;

public class AllInOne 
{

	public static void main(String[] args) 
	{
		/* Major Operators in JAVA
		 
		1. Arithmetic Operators (+,-,/,%,*)
		
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
		  all are errors */
		  
		  System.out.println("hello"+true);
		  System.out.println("hello"+false+true);
		  
		  //System.out.println(false+true+"hello");
		  //System.out.println("hello"*10);
		  //all are errors
		  
		  System.out.println('A'*10);
		  
		  
		  // 2. Relational Operators (<,>,<=,>=,==,!=,===) output -> true/false
		  
		  System.out.println(4>3);
		  System.out.println(5<2);
		  System.out.println(6>=5);
		  System.out.println(6<=5);
		  
		  //System.out.println(true<false); error
		  
		  System.out.println(true==true);
		  System.out.println('A'!=65);
		  
		  //System.out.println("B" === 66); error
		  
		  System.out.println('A'+'B'<'0');
		  
		  
		  // 3. Logical Operator -> output true/false
		  
		  System.out.println(4>3&&3<4);// AND
		  System.out.println(4<2&&4>3);// AND
		  System.out.println(4<2||4>5);// OR
		  System.out.println(4<2||4>1);// OR
		  System.out.println(!(5==6));//NOT
		  System.out.println(!(4==4));//NOT
		  
		  
		 //4. Assignment Operator
		  
		  int s;
		  s=50;
		  System.out.println(s);
		  
		  int e=30;
		  int f=50;
		  e=f;
		  System.out.println(e);
		  System.out.println(f);
		  
		  
		  // 5. Conditional Operators
		  
		  int a = 5;
		  int b = (a<10)?50:100;
		  System.out.println("b value is : "+b);
		  
		  int c = 10;		  
		  int d = (c>15)?10:15;
		  System.out.println("d value is : "+d);
		  
		  
		  //6. Increment/Decrement Operator
		  
		  int n = 5;
		  n++;
		  System.out.println(n);
		  
		  int m = 6;
		  --m;
		  System.out.println(m);
		  
		  int l = 7;
		  System.out.println(++l);
		  
		  int p = 11;
		  System.out.println(p--);
		  
		  int q = 10;
		  int w = --q;
		  System.out.println(q);
		  System.out.println(w);
		  
		  int r = 2;
		  int t = r++;
		  System.out.println(r);
		  System.out.println(t);
		  
		  
		  //7. Combinational Operator
		  
		  int i = 12;
		  i+=8;
		  System.out.println(i);
		  
		  int o = 15;
		  o-=5;
		  System.out.println(o);
		  
		  int k = 10;
		  k*=10;
		  System.out.println(k);
		  
		  int g = 15;
		  g/=5;
		  System.out.println(g);
		  
		  int h = 3;
		  h%=2;
		  System.out.println(h);
	}

}