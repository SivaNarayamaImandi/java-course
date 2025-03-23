package level1_programming;

public class PhonePay {

	public static void main(String[] args) 
	{
		System.out.println("Process starts.....");
		PhonePay r = new PhonePay();
		r.send();
		System.out.println("Process ends");
	}
	public void send()
	{
		System.out.println("Sending money.....");
		chaeckBalance();
		System.out.println("Transaction Completed");
	}
	public void chaeckBalance()
	{
		System.out.println("Checking balance.....");
		System.out.println("Balance is in rupees 1000/-");
	}

}
