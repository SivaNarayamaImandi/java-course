package _FinalExamPractice;

public class P077_P25 {

	public static void main(String[] args) {
		int star =9;
		int space=0;
		for(int i=1;i<=5;i++)
		{
			for(int b=1;b<=space;b++)
			{
				System.out.print("   ");
			}
			for(int a = 1;a<=star;a++)
			{
				System.out.print(" * ");
			}
			space++;
			star-=2;
			System.out.println();
		}
	}

}
