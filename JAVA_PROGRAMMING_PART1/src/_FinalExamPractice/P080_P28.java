package _FinalExamPractice;

public class P080_P28 {

	public static void main(String[] args) {
		int star=1;
		int space=4;
		for(int i =1;i<=9;i++)
		{
			for(int a =1;a<=space;a++)
			{
				System.out.print("   ");
			}
			for(int b= 1;b<=star;b++)
			{
				System.out.print(" * ");
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
