package thread_programs;

public class Flipkart {
	synchronized public void payment(String pType) {
		System.out.println("Payment is doing by using " + pType);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("handled");
		}
		System.out.println("PAYMENT IS DONE BY USING " + pType);
		System.out.println("*****************************************");
	}
}
