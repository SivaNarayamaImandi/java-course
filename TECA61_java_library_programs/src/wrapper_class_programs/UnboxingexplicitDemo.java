package wrapper_class_programs;

public class UnboxingexplicitDemo {
	public static void main(String[] args) {
		char c ='a';
		@SuppressWarnings("removal")
		Character c1=new Character(c);
		char c2=c1.charValue();//Explicit
		System.out.println(c2);
	}
}
