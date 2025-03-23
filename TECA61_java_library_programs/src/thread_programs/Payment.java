package thread_programs;

public class Payment extends Thread {
	public String pType;
	Flipkart f;

	public Payment(String pType, Flipkart f) {
		this.pType = pType;
		this.f = f;
	}

	@Override
	public void run() {
		f.payment(pType);
	}
}
