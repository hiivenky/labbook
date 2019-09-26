package com.cg.jdbc.service;

import java.math.BigInteger;
import java.util.List;

import com.cg.jdbc.dao.BookDao;
import com.cg.jdbc.dao.BookDaoImpl;
import com.cg.jdbc.dto.Book;

public class BookServiceImpl implements BookService {
	
	private BookDao bookDao= new BookDaoImpl();


	public Book addBook(Book book, BigInteger authorId) {
		// TODO Auto-generated method stub
		return bookDao.addBook(book, authorId);
	}

	public Book deleteBook(BigInteger bookId) {
		// TODO Auto-generated method stub
		return bookDao.deleteBook(bookId);
	}

	public int updateBooksPrice(BigInteger authorId,double cost) {
		// TODO Auto-generated method stub
		return bookDao.updateBooksPrice(authorId, cost);
	}

	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return bookDao.getBooks();
	}
	
	
	
	

}
