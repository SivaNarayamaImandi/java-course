package arraylist_programs;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("JAVA");
		al.add("Web technology");
		al.add("SQL");
		al.add("Oracle");
		al.add("AI");
		Iterator<String> i = al.iterator();
		while (i.hasNext()) {
			String next = i.next();
			char c = next.charAt(0);
			if (c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U'
					|| c == 'u')
				System.out.println(next);
		}

	}
}
