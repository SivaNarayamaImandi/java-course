package arraylist_programs;

import java.util.Enumeration;
import java.util.Vector;

public class MarkerMainClass {
	public static void main(String[] args) {
		Vector<EnumerationMarker> v = new Vector<EnumerationMarker>();
		EnumerationMarker e = new EnumerationMarker("cello", "red", 25);
		EnumerationMarker e1 = new EnumerationMarker("reynolds", "blue", 45);
		EnumerationMarker e2 = new EnumerationMarker("natraj", "black", 25);

		v.add(e);
		v.add(e1);
		v.add(e2);
		Enumeration<EnumerationMarker> em = v.elements();
		while (em.hasMoreElements()) {
			EnumerationMarker n = em.nextElement();
			if (n.getColor().equalsIgnoreCase("red")) {
				n.display();
			}
			System.out.println("---------------------");
			if (n.getCost() > 30 && n.getBrand().equalsIgnoreCase("reynolds")) {
				n.display();
			}
		}
	}
}
