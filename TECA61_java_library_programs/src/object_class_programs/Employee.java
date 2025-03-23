package object_class_programs;

public class Employee {
	public static void main(String[] args) {
		Employee e = new Employee();
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		String res = e.toString();
		System.out.println(res);
		System.out.println("-----------------------------------");
		System.out.println(e2.toString());
		System.out.println("-----------------------------------");
		System.out.println(e1.toString());
	}
}
