package assignment_programs;

public class Bank 
{
	private int balance;

    public Bank(int initialBalance) 
    {
        this.balance = initialBalance;
    }

    public void deposit(int amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(int amount) 
    {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } 
        else 
        {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public void showBalance() 
    {
        System.out.println("Current balance: " + balance);
    }

    public int getBalance() 
    {
        return balance;
    }
}
