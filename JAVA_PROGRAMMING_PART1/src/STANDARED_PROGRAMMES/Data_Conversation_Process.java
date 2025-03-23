package STANDARED_PROGRAMMES;

public class Data_Conversation_Process 
{

	public static void main(String[] args) 
	{
		/*1 byte = 8 bits
		 1 is used for sign (+/-)
		 7 is used for max = 2^7 = 128
		 in scale -128 to 127 (0 also considered as 1 number)
		 finally max = 2^7 - 1 = 127
		 there fore range of 1 BYTE = -128 to 127 
		 total = 256 (if you can't take 256 use 128 )
		 */
		//EXAMPLE
		short a = 130; //128(+ve)+2(-ve) (0,1,2,....128 done coming to FIRST -128,-127,-126,etc,.)
		byte b =(byte)a;
		System.out.println(b);
		
		//ANOTHER EX:
		short c = 550; //128(+ve)+128(-ve)+128(+ve)+128(-ve)+38(+ve) (or) 256(+ve)+256(-ve)+38(+ve)
		byte d = (byte)c;
		System.out.println(d);
		
		/*System.out.println(550/128); //128*4=512 550-512=38
		System.out.println(550/256); //256*2=512 550-512=38
		*/

	}

}