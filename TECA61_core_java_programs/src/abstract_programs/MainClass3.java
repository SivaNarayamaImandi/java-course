package abstract_programs;

abstract class E
{
	abstract public void test();
	abstract public void result();
}
abstract class F extends E
{
	public void test()
	{
		System.out.println("testing....");
	}
}
class G extends F
{
	public void result()
	{
		System.out.println("reusult....");
	}
}
public class MainClass3 {

	public static void main(String[] args) {
		G g = new G();
		g.test();
		g.result();
	}

}
