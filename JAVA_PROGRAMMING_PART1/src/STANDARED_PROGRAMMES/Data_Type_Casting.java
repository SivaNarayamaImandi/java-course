package STANDARED_PROGRAMMES;

public class Data_Type_Casting 
{

	public static void main(String[] args) 
	{
		//TYPES 1. WIDENING DTC 2. NARROWING DTC
		//1. widening DTC
		
		byte a = 10;
		short b = (short) a;
		System.out.println(b);
		// called EXPLICITE DTC (done by developer)
		
		byte c = 15;
		short d = c;
		System.out.println(d);
		//called IMPLICITE DTC (done by compiler b'coz there is no chance to loose our data)
		
		//2. narrowing DTC
		
		short e = 20;
		byte f = (byte)e;
		System.out.println(f);
		// called EXPLICITE DTC (done by developer)
		
		/*short g = 25;
		byte h = g;
		System.out.println(h);*/
		//called IMPLICITE DTC (can't done by compiler b'coz there is a chance loose our data)
	}

}