package abstract_programs;

abstract class A
{
	abstract public void test();
}
class B extends A
{
	public void test()
	{
		System.out.println("testing....1");
	}
}
class C extends A
{
	public void test()
	{
		System.out.println("testing....2");
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		B b = new B();
		b.test();
		C c = new C();
		c.test();
	}

}
