package level1_assignment_programs;

public class ShoppingCart {

	public static void main(String[] args) {
		System.out.println("Main method");
		ShoppingCart r = new ShoppingCart();
		r.checkout();
	}
	public void addItem()
	{
		System.out.println("addItem method");
		calculateTotal();
	}
	public void removeItem()
	{
		System.out.println("removeItem method");
		calculateTotal();
	}
	public void checkout()
	{
		System.out.println("checkout method");
		addItem();
		removeItem();
		generateInvoice();
	}
	public static void calculateTotal()
	{
		System.out.println("calculateTotal method");
	}
	public static void generateInvoice()
	{
		System.out.println("generateInvoice method");
	}
}
