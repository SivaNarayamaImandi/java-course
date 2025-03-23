package level2_assignment_programs;

public class MainClass7 {

	public static void main(String[] args) {
		Store s = new Store();
		s.sellProduct();
		Product.orderProduct();
		Category c = new Category();
		c.categorizeProduct();
	}

}
class Store{
	public void sellProduct(){
		System.out.println("sellProduct");
		Product.displayDetails();
	}
	public void restockProduct(){
		System.out.println("restockProduct");
	}
	public void checkInventory(){
		System.out.println("checkInventory");
	}
}
class Product{
	public static void displayDetails() {
		System.out.println("displayDetails");
		Store s = new Store();
		s.checkInventory();
	}
	public static void orderProduct(){
		System.out.println("orderProduct");
		Store s = new Store();
		s.restockProduct();
	}
}
class Category{
	public static void createCategory(){
		System.out.println("createCategory");
		Store s = new Store();
		s.sellProduct();
	}
	public void categorizeProduct(){
		System.out.println("categorizeProduct");
		Product.orderProduct();
	}
}

