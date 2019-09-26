package com.cg.jdbc.dao;

import java.math.BigInteger;
import java.util.List;

import com.cg.jdbc.dto.Book;

public interface BookDao {
	
	public Book addBook(Book book,BigInteger authorId);
	public Book deleteBook(BigInteger bookId);
	public int updateBooksPrice(BigInteger authorId,Double cost);
	public List<Book> getBooks();
}
