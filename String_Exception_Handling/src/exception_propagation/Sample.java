package exception_propagation;

public class Sample {
	public static void main(String[] args) {
		try {
			printMsg();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
	}

	public static void printMsg() throws InterruptedException {
		for (int i = 1; i <= 3; i++) {
			System.out.println("Hello!");
			Thread.sleep(1000);
		}
	}
}
//throws keyword used to propagate the calling method