package level2_assignment_programs;

public class MainClass8 {

	public static void main(String[] args) {
		Transaction.logTransaction();
		Transaction t = new Transaction();
		t.processTransaction();
	}
}
class Bank{
	public void openAccount(){
		System.out.println("openAccount");
		Account.displayAccountDetails();
	}
	public void closeAccount(){
		System.out.println("closeAccount");
	}
	public static void checkBalance(){
		System.out.println("checkBalance");
		Account.transferFunds();
	}
}
class Account{
	public static void displayAccountDetails(){
		System.out.println("displayAccountDetails");
		Bank.checkBalance();
	}
	public static void transferFunds(){
		System.out.println("transferFunds");
	}
}
class Transaction{
	public static void logTransaction(){
		System.out.println("logTransaction");
		Bank b = new Bank();
		b.openAccount();
	}
	public void processTransaction(){
		System.out.println("processTransaction");
		Bank b = new Bank();
		b.closeAccount();
	}
}