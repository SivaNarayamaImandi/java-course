package interface_programs;


interface Sample1
{
	double test1();
}
interface Sample2 extends Sample1
{
	void test2();
}
class Demo1 implements Sample2
{
	public double test1()
	{
		/* logic for test1() */
		return 0.0;
	}
	public void test2()
	{
		/* logic for test2() */
	}
}
public class MainClass1 {

	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		d1.test1();
		d1.test2();
	}

}
