package abstract_programs;

abstract class Exam
{
	abstract public void test();
	
	public void result()
	{
		System.out.println("Reuslt....");
	}
}
class Result extends Exam
{
	public void test()
	{
		System.out.println("Testing....");
	}
}
public class MainClass1 {

	public static void main(String[] args) {
		Result a = new Result();
		a.test();
		a.result();
		
	}

}
