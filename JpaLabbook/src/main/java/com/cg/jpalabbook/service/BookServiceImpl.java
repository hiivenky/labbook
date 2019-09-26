package com.cg.jpalabbook.service;

import java.util.List;

import com.cg.jpalabbook.dao.BookDao;
import com.cg.jpalabbook.dao.BookDaoImpl;
import com.cg.jpalabbook.dto.Author;
import com.cg.jpalabbook.dto.Book;

public class BookServiceImpl implements BookService{
	
	BookDao bookDao = new BookDaoImpl();

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		return bookDao.addBook(book);
	}

	@Override
	public Book deleteBook(Integer bookId) {
		// TODO Auto-generated method stub
		return bookDao.deleteBook(bookId);
	}

	@Override
	public List<Book> getBooks(Integer authorId) {
		// TODO Auto-generated method stub
		return bookDao.getBooks(authorId);
	}

	@Override
	public List<Book> getBooks(Double min, Double max) {
		// TODO Auto-generated method stub
		return bookDao.getBooks(min,max);
	}

	@Override
	public Author getAuthor(Integer authorId) {
		// TODO Auto-generated method stub
		return bookDao.getAuthor(authorId);
	}

	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return bookDao.getBooks();
	}

}
