package com.cg.jdbc.dto;

import java.math.BigInteger;

public class Book {
	
	private BigInteger isbn;
	private String book_Title;
	private Double book_Cost;
	
	public Book(BigInteger isbn, String book_Title, Double book_Cost) {
		super();
		this.isbn = isbn;
		this.book_Title = book_Title;
		this.book_Cost = book_Cost;
	}
	public Book() {
		
	}
	
	

	public Book(String book_Title, Double book_Cost) {
		super();
		this.book_Title = book_Title;
		this.book_Cost = book_Cost;
	}
	public BigInteger getIsbn() {
		return isbn;
	}

	public void setIsbn(BigInteger isbn) {
		this.isbn = isbn;
	}

	public String getBook_Title() {
		return book_Title;
	}

	public void setBook_Title(String book_Title) {
		this.book_Title = book_Title;
	}

	public Double getBook_Cost() {
		return book_Cost;
	}

	public void setBook_Cost(Double book_Cost) {
		this.book_Cost = book_Cost;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", book_Title=" + book_Title + ", book_Cost=" + book_Cost + "]";
	}
	

}

