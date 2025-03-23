package _ExamPractice;

public class Pt3 {

	public static void main(String[] args) {
		for (int u =1;u<=5;u++)
		{
			for(int y=1;y<=5;y++)
			{
				if(u==1&&y==3)
				{
					System.out.print(" # ");
				}
				else if(u==3&&y==4)
				{
					System.out.print(" @ ");
				}
				else
				{
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
	}

}
