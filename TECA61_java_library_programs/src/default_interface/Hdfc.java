package default_interface;

import java.util.Scanner;

public class Hdfc implements Atm {
	public static int minbal=500;
	Scanner sc = new Scanner(System.in);

	@Override
	public void deposit() {
		System.out.print("\nENTER AMOUNT TO DEPOSIT(AMOUNT MORETHAN 0RS) : ");
		int d=sc.nextInt();
		if(d>0)
		{
			minbal+=d;
			System.out.println("\nDEPOSIT SUCCESSFULL.........");
			System.out.println("\nPRESENT BALANCE IS : "+minbal);
		}
		else
		{
			System.out.println("\nENTER VALID AMOUNT TO DEPOSIT");
		}
	}

	@Override
	public void withdraw() {
		System.out.print("\nENTER WITHDRAW AMOUNT : ");
		int w=sc.nextInt();
		if(w>0 && w<minbal)
		{
			minbal-=w;
			System.out.println("\nWITHDRAW SUCCESSFULL.........");
			System.out.println("\nPRESENT BALANCE IS : "+minbal);
		}
		else
		{
			System.out.println("\nINSUFFICENT BALANCE ");
		}
		
	}

	@Override
	public void showBal() {
		System.out.println("\nPRESENT BALANCE IS : "+minbal);
	}
	@Override
	public void loan() {
		System.out.print("\nENTER LOAN AMOUNT : ");
		int loan = sc.nextInt();
		System.out.print("\nENTER TENUER : ");
		int tenuer = sc.nextInt();
		System.out.println("\nINTREST IS 1.5%\nTOTAL AMOUNT IS : ");
		System.out.println(loan * 1.5 * tenuer);
	}
	
	public void display()
	{
		System.out.println(
				"\nYOU ENTERED INTO HDFC PORTEL\n\nENTER 1 FOR SHOW BALANCE\nENTER 2 FOR DEPOSIT\nENTER 3 FOR WITHDRAW\nENTER 4 FOR UPI ENABLE\nENTER 5 FOR EXIT");
		int choice=sc.nextInt();
		if(choice==1)
		{
			showBal();
			
		}
		else if (choice==2)
		{
			deposit();
		}
		else if(choice==3)
		{
			withdraw();
		}
		else if(choice==4)
		{
			loan();
		}
		else
		{
			System.out.println("\nTHANK YOU FOR VISITING.......");
		}
	}
}
