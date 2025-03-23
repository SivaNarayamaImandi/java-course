package interface_programs;

interface Sample6
{
	String test4(int a,char d);
}
interface Sample7 extends Sample6
{
	boolean test5(double a,int b);
}
interface Sample8 extends Sample6
{
	char test6(double a,char b);
}

class Demo3 implements Sample7
{
	public String test4(int a,char d)
	{
		/*logic*/
		return null;
	}
	public boolean test5(double a,int b)
	{
		/*logic*/
		return false;
	}
}

class Demo4 implements Sample8
{
	public String test4(int a,char d)
	{
		/*logic*/
		return null;
	}
	public char test6(double a,char b)
	{
		/*logic*/
		return ' ';
	}
}
public class MainClass3 {

	public static void main(String[] args) {
		Demo3 d3 = new Demo3();
		System.out.println(d3.test4(10, 'a'));
		boolean d = d3.test5(10.6, 99);
		System.out.println(d);
		Demo4 d4 = new Demo4();
		System.out.println(d4.test4(10, 'a'));
		d4.test6(10.6, 'B');
	}

}
