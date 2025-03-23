package level1_programming;

public class Student {

	public static void percentage()
	{
		System.out.println("78%");
	}
	public void name()
	{
		System.out.println("Student name is SIVA");
		percentage();
	}
	public static void main(String[] args) 
	{
		System.out.println("Student information");
		Student s = new Student();
		s.name();
	}

}
