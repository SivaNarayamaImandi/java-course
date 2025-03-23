package function_interface_lambda_expresion;

public class CreateThreadMain {
	public static void main(String[] args) {
		//WAPT create thread by using lambda expresion and print 
		//thread id
		//thread name
		//thread priority
		Runnable r = ()->
		{
			System.out.println("THREAD CREATED");
		};
		Thread t=new Thread(r);
		t.start();
		System.out.println("THREAD ID : "+t.getId());
		System.out.println("THREAD NAME : "+t.getName());
		System.out.println("THREAD PRIORITY : "+t.getPriority());
	}
}
 