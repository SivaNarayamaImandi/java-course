package level2_assignment_programs;

public class MainClass6 {

	public static void main(String[] args) {
		Library l = new Library();
		l.borrowBook();
		Boook b = new Boook();
		b.reserveBook();
	}

}
class Library {
	public void borrowBook(){
		System.out.println("borrowBook");
		Boook.displayDetails();
	}
	public void returnBook(){
		System.out.println("returnBook");
	}
	public void checkAvailability(){
		System.out.println("checkAvailability");
	}
}
class Boook {
	public static void displayDetails(){
		System.out.println("displayDetails");
		Library l = new Library();
		l.checkAvailability();
	}
	public void reserveBook(){
		System.out.println("reserveBook");
		Library l = new Library();
		l.returnBook();
	}
}