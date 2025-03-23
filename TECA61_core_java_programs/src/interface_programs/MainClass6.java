package interface_programs;

abstract class Test
{
	abstract public void display();
}
interface Smaple14
{
	char test14(int a,boolean b,char c,String d);
}
class Demo7 extends Test implements Smaple14
{
	public void display()
	{
		/*logic*/
	}
	public char test14(int a,boolean b,char c,String d)
	{
		return ' ';
	}
}
public class MainClass6 {

	public static void main(String[] args) {
		Demo7 d7 = new Demo7();
		d7.display();
		d7.test14(99, false, 'F', "SIVA");
	}

}