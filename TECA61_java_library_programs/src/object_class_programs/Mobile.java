package object_class_programs;

public class Mobile {
	public static void main(String[] args) {
		Mobile m = new Mobile();
		System.out.println(m.toString());//explicit
		System.out.println("-----------------------------------");
		int uid=m.hashCode();
		System.out.println(uid);
		System.out.println("-----------------------------------");
		Mobile m1 = new Mobile();
		System.out.println(m1);//implicit
		System.out.println("-----------------------------------");
		int uid1=m1.hashCode();
		System.out.println(uid1);
	}
}
