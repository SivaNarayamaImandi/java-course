package interface_programs;


interface Sample3
{
	double test1();
}
interface Sample4 extends Sample3
{
	boolean test2();
}
interface Sample5 extends Sample4
{
	void test3();
}
class Demo2 implements Sample5
{
	public double test1()
	{
		/* logic for test1() */
		return 0.0;
	}
	public boolean test2()
	{
		/* logic for test2() */
		return false;
	}
	public void test3()
	{
		/* logic for test3() */
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		Demo2 d2 = new Demo2();
		d2.test1();
		d2.test2();
		d2.test3();
	}

}
