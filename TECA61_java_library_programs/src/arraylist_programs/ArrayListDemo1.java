package arraylist_programs;

import java.util.ArrayList;

public class ArrayListDemo1 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(500);
		al.add("Siva");
		al.add(true);
		al.add(77.9);
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
	}
}
