package object_class_programs;

public class Bag {
	public static void main(String[] args) {
		Bag b1 = new Bag();
		Bag b2 = new Bag();
		Bag b3 = new Bag();
		Bag b4 = new Bag();
		System.out.println(b3);
		
		System.out.println("-----------------------------------");
		
		boolean res = b1.equals(b4);
		System.out.println(res);
		
		System.out.println("-----------------------------------");

		int uidB2=b2.hashCode();
		int uidB4=b4.hashCode();
		System.out.println(uidB2);
		
		System.out.println("-----------------------------------");

		System.out.println(uidB4);
	}
}
