package thread_programs;

public class Main {
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.getId());
		Demo d1 = new Demo();
		System.out.println(d1.getId());
		d1.start();
		d.start();
	}
}
