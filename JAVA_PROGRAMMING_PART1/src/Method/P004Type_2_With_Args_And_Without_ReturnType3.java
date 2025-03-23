package Method;

public class P004Type_2_With_Args_And_Without_ReturnType3 
{
	public static void stdDetails(String name,double percentage)
	{
		System.out.println("Name is : "+name);
		System.out.println("Percentage is : "+percentage);
	}
	public static void main(String[] args) 
	{
		System.out.println("Student Percentage");
		System.out.println();
		stdDetails("Siva",75.7);
		System.out.println();
		stdDetails("Bhagat",80.3);
		System.out.println();
		stdDetails("Govindh",99.9);
	}
}