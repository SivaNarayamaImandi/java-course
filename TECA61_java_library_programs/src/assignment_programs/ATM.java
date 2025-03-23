package assignment_programs;

import java.util.Scanner;

public class ATM 
{
	private Bank bank;

    public ATM(Bank bank) 
    {
        this.bank = bank;
    }

    public void start() 
    {
        Scanner sc = new Scanner(System.in);
        while (true) 
        {
        	System.out.println();
            System.out.println("Select any one option");
            System.out.println("==========================");
            System.out.println();
            System.out.println("1 - Deposit");
            System.out.println();
            System.out.println("2 - Withdraw");
            System.out.println();
            System.out.println("3 - Show Balance");
            System.out.println();
            System.out.println("4 - Exit");
            System.out.println();
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                	System.out.println();
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = sc.nextInt();
                    bank.deposit(depositAmount);
                    break;
                case 2:
                	System.out.println();
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    bank.withdraw(withdrawAmount);
                    break;
                case 3:
                	System.out.println();
                    bank.showBalance();
                    break;
                case 4:
                	System.out.println();
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                	System.out.println();
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
