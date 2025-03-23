package approach_2_programming;

public class AC 
{
	private String acType;
	private int capacity;
	private String brand;
	
	public void initialization(String acType,int capacity,String brand)
	{
		
		if(validateAcType(acType)==1)
		{
			this.acType=acType;
		}
		else
		{
			System.err.println("INVALID DATA");
		}
		
		if(validateCapacity(capacity)!=null)
		{
			this.capacity=capacity;
		}
		else
		{
			System.err.println("INVALID DATA");
		}
		
		if(validateBrand(brand))
		{
			this.brand=brand;
		}
		else
		{
			System.err.println("INVALID DATA");
		}
	}
	
	private int validateAcType(String acType)
	{
		if(acType.equals("SPLIT AC") || acType.equals("CENTRAL AC") || acType.equals("CARTAR AC"))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	private String validateCapacity(int capacity)
	{
		if(capacity>=1 && capacity<=16)
		{
			return "VALID";
		}
		else
		{
			return null;
		}
	}
	
	private boolean validateBrand(String brand)
	{
		if(brand.equals("LG") || brand.equals("SAMSUNG") || brand.equals("BLUESTAR"))
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
		System.out.println("AC TYPE : "+acType);
		System.out.println("AC CAPACITY : "+capacity);
		System.out.println("AC BRAND : "+brand);
	}
}
