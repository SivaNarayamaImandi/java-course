package approach_2_programming;

public class Rectangle 
{
	private int length;
	private int width;
	
	public void initialization(int length,int width)
	{
		boolean len=validateLength(length);
		if(len)
		{
			this.length=length;
		}
		else
		{
			System.err.println("INAVALID DATA");
		}
		boolean wid=validateWidth(width);
		if(wid)
		{
			this.width=width;
		}
		else
		{
			System.err.println("INAVALID DATA");
		}
	}
	
	private boolean validateLength(int length)
	{
		if(length>8)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	private boolean validateWidth(int width)
	{
		if(width>8)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void display()
	{
		System.out.println("Width : "+width);
		System.out.println("Length : "+length);
	}
}
