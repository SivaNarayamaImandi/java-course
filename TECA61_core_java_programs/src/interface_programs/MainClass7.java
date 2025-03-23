package interface_programs;

interface Smaple15
{
	String test15(int c);
	void test16(boolean b);
	char test17(String d);
}
class Demo8 implements Smaple15
{
	public String test15(int c)
	{
		return null;
	}
	public void test16(boolean b)
	{
		/*logic*/
	}
	public char test17(String d)
	{
		return ' ';
	}
}
class Demo9 implements Smaple15
{
	public String test15(int c)
	{
		return null;
	}
	public void test16(boolean b)
	{
		/*logic*/
	}
	public char test17(String d)
	{
		return ' ';
	}
}
public class MainClass7 {

	public static void main(String[] args) {
		Demo8 d8 = new Demo8();
		d8.test15(10);
		d8.test16(false);
		d8.test17("RAM");
		
		Demo9 d9 = new Demo9();
		d9.test15(56);
		d9.test16(false);
		d9.test17("HANUMAN");
	}

}
