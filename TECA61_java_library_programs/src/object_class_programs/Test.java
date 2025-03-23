package object_class_programs;

public class Test {
	public static void main(String[] args) {
		String s ="java";
		String s1 = "sql";
		String s2="java";
		System.out.println(s==s1);
		System.out.println(s==s2);
		
		System.out.println("-----------------------------------");
		
		String a = new String("java");
		String a1 = new String("java");
		System.out.println(a==a1);
	}
}
