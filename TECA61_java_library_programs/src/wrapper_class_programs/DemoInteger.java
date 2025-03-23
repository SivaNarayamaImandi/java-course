package wrapper_class_programs;

public class DemoInteger {
	public static void main(String[] args) {
		int a =10;
		@SuppressWarnings("removal")
		Integer i = new Integer(a);//explicit
		System.out.println(i);
		
		double b= 7.5;
		Double j=b;//implicit
		System.out.println(j);
	}
}
