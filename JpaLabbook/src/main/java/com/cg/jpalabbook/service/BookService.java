package com.cg.jpalabbook.service;

import java.util.List;

import com.cg.jpalabbook.dto.Author;
import com.cg.jpalabbook.dto.Book;

public interface BookService {
	
	public Book addBook(Book book);
	public Book deleteBook(Integer bookId);
	public List<Book> getBooks(Integer authorId);
	public List<Book> getBooks(Double min,Double max);
	public Author getAuthor(Integer authorId);
	public List<Book> getBooks();

}
