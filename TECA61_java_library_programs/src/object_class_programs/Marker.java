package object_class_programs;

public class Marker {
	public static void main(String[] args) {
		Marker m = new Marker();
		Marker m1 = new Marker();
		System.out.println(m);
		System.out.println("-----------------------------------");
		System.out.println(m1);
		boolean res = m.equals(m1);
		System.out.println("-----------------------------------");
		System.out.println(res);
	}
}
