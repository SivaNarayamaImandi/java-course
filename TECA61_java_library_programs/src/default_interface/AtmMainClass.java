package default_interface;

import java.util.Scanner;

public class AtmMainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sbi s= new Sbi();
		Hdfc h=new Hdfc();
		System.out.println("CHOOSE FOR ONE OPTION\n\nENTER 1 FOR SBI : \nENTER 2 FOR HDFC : \nENTER 3 FOR EXIT : ");
		int choose = sc.nextInt();
		while(true)
		{
			switch (choose) {
			case 1: {
				
				while(true)
				{
					s.display();
					System.out.println("\nENTER 1 FOR OPTIONS\nENTER 2 FOR EXIT");
					if(sc.nextInt()==1)
					{
						s.display();
					}
					else
					{
						System.out.println("\nTHANK YOU FOR VISITING.......");
						break;
					}
				}
			}
			break;
			case 2: {
				while(true)
				{
					h.display();
					System.out.println("\nENTER 1 FOR OPTIONS\nENTER 2 FOR EXIT");
					if(sc.nextInt()==1)
					{
						h.display();
					}
					else
					{
						System.out.println("\nTHANK YOU FOR VISITING.......");
						break;
					}
				}
			}
			break;
			case 3: {
				System.out.println("\nTHANK YOU FOR VISITING.......");
				break;
			}
			default: System.out.println("\nTHANK YOU FOR VISITING.......");
				break;
			}
			sc.close();
			break;
		}
	}
}
