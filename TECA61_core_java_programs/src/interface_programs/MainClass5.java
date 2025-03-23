package interface_programs;

interface Smaple12
{
	void test10();
	String test11(char b);
}
interface Smaple13
{
	int test12(int a,boolean v);
	boolean test13(String j);
	
}
class Demo6 implements Smaple12,Smaple13
{
	public void test10()
	{
		/* logic*/
	}
	public String test11(char b)
	{
		return null;
	}
	public int test12(int a,boolean v)
	{
		return 0;
	}
	public boolean test13(String j)
	{
		return false;
	}
}
public class MainClass5 {

	public static void main(String[] args) {
		Demo6 d6 = new Demo6();
		d6.test10();
		String v = d6.test11('A');
		System.out.println(v);
		System.out.println(d6.test12(10, false));
		if(d6.test13(v)==false)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}

}
