package interface_programs;

interface Sample9
{
	char test7();
}
interface Sample10
{
	boolean test8();
}
interface Smaple11 extends Sample10,Sample9
{
	void test9();
}
class Demo5 implements Smaple11
{
	public char test7()
	{
		/*logic*/
		return ' ';
	}
	public boolean test8()
	{
		/*logic*/
		return false;
	}
	public void test9()
	{
		/*logic*/
	}
}
public class MainClass4 {

	public static void main(String[] args) {
		Demo5 d5 = new Demo5();
		d5.test7();
		boolean c = d5.test8();
		System.out.println(c);
		d5.test9();
	}

}
