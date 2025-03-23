package object_class_programs;

public class Student {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		String res =s1.toString();
		System.out.println(res);
		System.out.println("-----------------------------------");
		System.out.println(s2);
		System.out.println("-----------------------------------");
		boolean res1=s3.equals(s4);
		System.out.println(res1);
	}
}
