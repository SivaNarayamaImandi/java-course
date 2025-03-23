package _FinalExamPractice;

public class P075_P23 {

	public static void main(String[] args) {
		int x=10;
		for(int i=1;i<=4;i++)
		{
			for(int j =1;j<=4;j++)
			{
				while (true) {
					x++;
					int count=0;
					for(int k=1;k<=x;k++)
					{
						if(x%k==0)
						{
							count++;
						}
					}
					if(count==2)
					{
						System.out.print(" "+x+" ");
						break;
					}
				}
			}
			System.out.println();
		}
	}

}
