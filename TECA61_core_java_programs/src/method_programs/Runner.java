package method_programs;

public class Runner {

	public static void convert(int kms)
	{
		int totalMeters = kms*1000;
		System.out.println("Men travelled every day "+kms+"kms");
		System.out.println("=======OR========");
		System.out.println("Men travelled every day "+totalMeters+"metes");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		convert(5);
	}

}
