package exception_propagation;

public class Demo {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			System.out.println("HAI");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
