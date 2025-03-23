package approach_3_programs;

import java.util.ArrayList;

public class MainClass4 
{
	public static void main(String[] args) {
		Rectangle rect1=new Rectangle();
		Rectangle rect2=new Rectangle();
		Rectangle rect3=new Rectangle();
		
		ArrayList al=new ArrayList();
		al.add(rect1);
		al.add(rect2);
		al.add(rect3);
		
		Rectangle r1=(Rectangle)al.get(0);
		Rectangle r2=(Rectangle)al.get(1);
		Rectangle r3=(Rectangle)al.get(2);
		
		System.out.println("----------------------------");
		r1.initialization(20, 40);
		r1.display();
		System.out.println("----------------------------");
		r2.initialization(30, 60);
		r2.display();
		System.out.println("----------------------------");
		r3.initialization(50, 100);
		r3.display();
	}
	
	
}
