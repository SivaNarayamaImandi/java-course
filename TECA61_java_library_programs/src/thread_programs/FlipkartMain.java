package thread_programs;

public class FlipkartMain {
	public static void main(String[] args) {
		Flipkart f = new Flipkart();
		Payment p = new Payment("PHONE PAY", f);
		p.start();
		Payment p1 = new Payment("PAYTM", f);
		p1.start();
		Payment p2 = new Payment("GOOGLE PAY", f);
		p2.start();
	}
}
