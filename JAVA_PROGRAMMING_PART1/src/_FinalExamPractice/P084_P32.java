package _FinalExamPractice;

public class P084_P32 {

	public static void main(String[] args) {
		int space=0;
		int star=5;
		for(int i=1;i<=9;i++)
		{
			for(int a = 1;a<=star;a++)
			{
				System.out.print(" * ");
			}
			for(int b = 1;b<=space;b++)
			{
				System.out.print("   ");
			}
			for(int c=1;c<=star;c++)
			{
				System.out.print(" * ");
			}
			if(i<=4)
			{
				space+=2;star--;
			}
			else
			{
				space-=2;star++;
			}
			System.out.println();
		}
	}

}
