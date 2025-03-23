package com;

public class Book {
	//WAPFBR 
	//Create a class called book
	//book attribute are :
	//bookid, bookTitle,author,noOfpages,cost
	//initialize the values by using constructer
	//create a method to display book details
	//create 3 book objects
	//WAPTP bookid,noOfpages,author as a useful info of 2nd book
	//WAPTP 1st and 3rd book details
	int bookId;
	String bookTitle;
	String author;
	int noOfPages;
	double cost;
	
	public Book(int bookId,String bookTitle,String author,int noOfPages,double cost )
	{
		this.bookId=bookId;
		this.bookTitle=bookTitle;
		this.author=author;
		this.noOfPages=noOfPages;
		this.cost=cost;
	}
	@Override
	public boolean equals(Object o)
	{
		Book book1=(Book)o;
		return this.bookId==book1.bookId;
	}
	@Override
	public String toString()
	{
		return bookId+" "+noOfPages+" "+author;
		
	}
	@Override
	public int hashCode()
	{
		return bookId;
	}
	public void display()
	{
		System.out.println("Book Details : "+bookId+" "+bookTitle+" "+author+" "+noOfPages+" "+cost);
	}
	public static void main(String[] args) {
		Book book=new Book(1, "JS", "James", 200, 350);
		Book book1=new Book(2, "HTML", "mikel", 100, 450);
		Book book2=new Book(3, "CSS", "JOHN", 400, 550);
		
		String string = book1.toString();
		System.out.println(string+"\n");
		book.display();
		book2.display();
		boolean b = book.equals(book1);
		System.out.println(b);
		
		int i = book.hashCode();
		int j = book.hashCode();
		int k = book.hashCode();
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
}
