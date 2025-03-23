package ha_a;

public class Book {
	int bookId;
	String bookTitle;
	int cost;
	String author;
	int noOfPages;

	public Book(int bookId, String bookTitle, int cost, String author, int noofPages) {
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.cost = cost;
		this.author = author;
		this.noOfPages = noofPages;
	}

	public void display() {
		System.out.println("Book Id : " + bookId);
		System.out.println("Book Title : " + bookTitle);
		System.out.println("Book cost : " + cost);
		System.out.println("Book Author : " + author);
		System.out.println("No of Pages in a Book  : " + noOfPages);
	}
}
