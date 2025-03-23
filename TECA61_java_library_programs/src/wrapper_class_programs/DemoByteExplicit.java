package wrapper_class_programs;

public class DemoByteExplicit {
	public static void main(String[] args) {
		byte x=4;
		@SuppressWarnings("removal")
		Byte d = new Byte(x);//explicit
		System.out.println(d);
	}
}
