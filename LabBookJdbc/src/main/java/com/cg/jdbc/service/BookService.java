package com.cg.jdbc.service;

import java.math.BigInteger;
import java.util.List;

import com.cg.jdbc.dto.Book;

public interface BookService {
	
	public Book addBook(Book book,BigInteger authorId);
	public Book deleteBook(BigInteger bookId);
	public int updateBooksPrice(BigInteger authorId,double cost);
	public List<Book> getBooks();

}
