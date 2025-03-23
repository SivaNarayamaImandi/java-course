package _FinalExamPractice;

public class P085_P33 {

	public static void main(String[] args) {
		int space=4;
		int star=1;
		for(int i=1;i<=9;i++)
		{
			for(int a =1;a<=space;a++)
			{
				System.out.print("   ");
			}
			for(int b=1;b<=star;b++)
			{
				if(b==1||b==star||b==5&&i==5)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			if(i<=4)
			{
				space--;star+=2;
			}
			else
			{
				space++;star-=2;
			}
			System.out.println();
		}
	}

}
