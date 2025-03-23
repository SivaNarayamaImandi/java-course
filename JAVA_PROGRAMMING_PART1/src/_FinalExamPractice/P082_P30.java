package _FinalExamPractice;

public class P082_P30 {

	public static void main(String[] args) {
		int space=3;
		int pair=1;
		for(int i=1;i<=4;i++)
		{
			for(int a = 1;a<=space;a++)
			{
				System.out.print(" ");
			}
			for(int b =1;b<=pair;b++)
			{
				System.out.print("* ");
			}
			space--;pair++;
			System.out.println();
		}
	}

}
