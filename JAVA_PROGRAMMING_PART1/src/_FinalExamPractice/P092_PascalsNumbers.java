package _FinalExamPractice;

public class P092_PascalsNumbers {

	public static void main(String[] args) {
		int space=3;
		int pair=1;
		for(int i=1;i<=7;i++)
		{
			for(int a =1;a<=space;a++)
			{
				System.out.print(" ");
			}
			int x=1;
			for(int b=1;b<=pair;b++)
			{
				if(b==4&&i==4)
				{
					System.out.print("0 ");
				}
				else
				{
					System.out.print(x+" ");
					x=(x*(i-b))/(b+1);
				}
			}
			if(i<=3)
			{
				space--;pair+=2;
			}
			else
			{
				space++;pair-=2;
			}
			System.out.println();
		}
	}

}
