package collection_frameworks;

import java.util.ArrayList;

public class BagMainClass {
	public static void main(String[] args) {
		Bag b1 = new Bag("American Turism", "Red", 600, 3);
		Bag b2 = new Bag("Sky Bags", "Blue", 500, 4);
		Bag b3 = new Bag("WildCat", "Green", 700, 2);
		Bag b4 = new Bag("Wrong", "Black", 400, 3);
		ArrayList<Bag> al = new ArrayList<Bag>();
		al.add(b1);
		al.add(b2);
		al.add(b3);
		al.add(b4);
		System.out.println("CREATE OPERATION\n");
		for (Bag bag : al) {
			if (bag.getCapacity() == 3)
				System.out.println("BAG COLOR " + bag.getColor() + " : " + "\nBAG COST : " + bag.getCost());
		}
		System.out.println("----------------------");
		System.out.println("READ OPERATION\n");
		for (Bag bag : al) {
			if (bag.getBrand().equalsIgnoreCase("SKY BAGS"))
				System.out.println(al);
		}
		System.out.println("----------------------");
		System.out.println("UPDATE OPERATION\n");
		for (Bag bag : al) {
			if (bag.getCapacity() == 2)
				bag.setCost(300);
			System.out.println("BAG COST : " + bag.getCost());
		}
		System.out.println("----------------------");
		System.out.println("REMOVEING OPERATON\n");
		for (Bag bag : al) {
			if (bag.getColor().equalsIgnoreCase("Black")) {
//				for (int i = 0; i < al.size(); i++) {
//					al.remove(i);
//				}
				al.remove(bag);
			}
			System.out.println(al);
		}
	}
}
