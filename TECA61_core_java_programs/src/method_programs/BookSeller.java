package method_programs;

public class BookSeller {
	
	public static void calCPandPP(int profit,int soldPrice)
	{
		double costPrice = soldPrice-profit;
		System.out.println("Cost price of book is "+costPrice+"rupees");
		double profitPercentage = (profit/costPrice)*100;
		System.out.println("Percentage os Profit "+profitPercentage+"%");
	}
	public static void main(String[] args) 
	{
		calCPandPP(20,100);
	}

}