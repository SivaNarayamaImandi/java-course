package approach_2_programming;

import java.util.ArrayList;

public class MainClass4 {
	public static void main(String[] args) {
		AC ac1= new AC();
		AC ac2= new AC();
		AC ac3= new AC();
		
		ArrayList al=new ArrayList();
		al.add(ac1);
		al.add(ac2);
		al.add(ac3);
		
		AC a1=(AC)al.get(0);
		AC a2=(AC)al.get(1);
		AC a3=(AC)al.get(2);
		
		a1.initialization("SPLIT AC", 4, "LG");
		a1.display();
		System.out.println("-------------------------");
		a2.initialization("CENTRAL AC", 15, "BLUESTAR");
		a2.display();
		System.out.println("-------------------------");
		a3.initialization("CARTAR AC", 6, "SAMSUNG");
		a3.display();

	}
}
