package assignment_programs;

public class BankApp 
{
	public static void main(String[] args) 
	{
        Bank bank = new Bank(1000); // Initial balance set to 1000
        ATM atm = new ATM(bank);
        atm.start();
    }
}