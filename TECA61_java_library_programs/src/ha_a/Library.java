package ha_a;

public class Library {
	String name;
	String location;
	String time;
	Book b;

	public Library(String name, String location, String time, Book b) {
		this.name = name;
		this.location = location;
		this.time = time;
		this.b = b;
	}

	public void display() {
		System.out.println("Library Details");
		System.out.println("*****--------******");
		System.out.println("Library name : " + name);
		System.out.println("Library Location : " + location);
		System.out.println("Library timinigs : " + time);
		System.out.println("\nBook details");
		System.out.println("******--------******");
		System.out.println("Book Id : " + b.bookId);
		System.out.println("Book Title : " + b.bookTitle);
		System.out.println("Book cost : " + b.cost);
		System.out.println("Book Author : " + b.author);
		System.out.println("No of Pages in a Book  : " + b.noOfPages);
	}

}
