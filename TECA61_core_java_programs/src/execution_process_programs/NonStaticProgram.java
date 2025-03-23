package execution_process_programs;

public class NonStaticProgram {

	public boolean NonStatic(boolean a)
	{
		return a;
	}
	public static void main(String[] args) 
	{
		NonStaticProgram r = new NonStaticProgram();
		System.out.println(r.NonStatic(true));
	}

}
