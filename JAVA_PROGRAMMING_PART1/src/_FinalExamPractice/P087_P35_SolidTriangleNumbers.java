package _FinalExamPractice;

public class P087_P35_SolidTriangleNumbers {

	public static void main(String[] args) {
		int space=5;
		int pair=1;
		for(int i=1;i<=5;i++)
		{
			for(int a =1;a<=space;a++)
			{
				System.out.print(" ");
			}
			int x=1;
			int nu=i;
			int du=1;
			for(int b=0;b<pair;b++)
			{
				System.out.print(x+" ");
				x=(x*nu)/du;
				nu--;du++;
			}
			space--;pair++;
			System.out.println();
		}
	}

}
