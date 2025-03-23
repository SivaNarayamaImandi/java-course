package arraylist_programs;

import java.util.ArrayList;

public class ArrayListDemo {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(28);
		al.add(1, "Tom");
		al.add('A');
		System.out.println(al);
		Object data=al.get(1);
		System.out.println(data);
		al.contains('A');
		al.remove(3);
		System.out.println(al);
		System.out.println(al.size());
	}
}
