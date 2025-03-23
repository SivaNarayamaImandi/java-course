package com;

public class Book1 {
	private int bookId;
	private String bookTitle;
	private String author;
	private int cost;
	private int noOfPages;
	private String publishDate;

	public Book1(int bookId, String bookTitle, String author, int cost, int noOfPages, String publishDate) {
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.author = author;
		this.cost = cost;
		this.noOfPages = noOfPages;
		this.publishDate = publishDate;
	}
	public int getBookId()
	{
		return bookId;
	}
	public void setBookTitle(String bookTitle)
	{
		this.bookTitle=bookTitle;
	}
	public String getBookTitle()
	{
		return bookTitle;
	}
	public String getAuthor()
	{
		return author;
	}
	public void setBookCost(int cost)
	{
		this.cost=cost;
	}
	public int getBookCost()
	{
		return cost;
	}
	public void setBookNoOfPages(int noOfPages)
	{
		this.noOfPages=noOfPages;
	}
	public int getBookNoOfPages()
	{
		return noOfPages;
	}
	public void setBookPublishDate(String publishDate)
	{
		this.publishDate=publishDate;
	}
	public String getBookPublishDate()
	{
		return publishDate;
	}
	public void display()
	{
		System.out.println(getBookId());
		System.out.println(getBookTitle());
		System.out.println(getAuthor());
		System.out.println(getBookCost());
		System.out.println(getBookNoOfPages());
		System.out.println(getBookPublishDate());
	}

}
