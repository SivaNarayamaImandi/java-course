package method_overloading_programs;

public class MainMethodOverload {

	public static void main(boolean a)
	{
		System.out.println(a);
	}
	public int main(int a)
	{
		return a;
	}
	public static void main(String[] args) 
	{
		MainMethodOverload r = new MainMethodOverload();
		System.out.println(r.main(6));
		main(true);
	}

}
