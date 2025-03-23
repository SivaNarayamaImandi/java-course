package wrapper_class_programs;

public class DemoCharExplicit {
	public static void main(String[] args) {
		char m ='A';
		@SuppressWarnings("removal")
		Character v = new Character(m);//explicit
		System.out.println(v);
	}
}
