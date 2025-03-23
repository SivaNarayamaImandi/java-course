package wrapper_class_programs;

public class Combination1 {
	public static void main(String[] args) {
		long l = 99999;
		@SuppressWarnings("removal")
		Long l1 = new Long(l);//explicit
		long l2 = l1;//implicit
		System.out.println(l2);
	}
}
