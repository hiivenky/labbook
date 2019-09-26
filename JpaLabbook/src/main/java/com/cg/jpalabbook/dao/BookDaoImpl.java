package com.cg.jpalabbook.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.jpalabbook.dto.Author;
import com.cg.jpalabbook.dto.Book;

public class BookDaoImpl implements BookDao{
	
	private static EntityManagerFactory emf;
	private static EntityManager em;
	static {
		emf = Persistence.createEntityManagerFactory("jpalabbook");
	    em = emf.createEntityManager();
	}

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		Author author = em.find(Author.class, book.getAuthor().getAuthorId());
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		if(author!=null) {
			book.setAuthor(author);
		}
		em.persist(book);
		trans.commit();
		return book;
	}

	@Override
	public Book deleteBook(Integer bookId) {
		// TODO Auto-generated method stub
		Book book = em.find(Book.class, bookId);
		if(book!=null) {
			em.remove(book);
			return book;
		}
		return null;
	}
	public List<Book> getBooks(Integer authorId){
		Author author = em.find(Author.class, authorId);
		if(author!=null) {
			return author.getBooks();
		}
		return null;
	}

	@Override
	public List<Book> getBooks(Double min, Double max) {
		// TODO Auto-generated method stub
		String sql="from Book b where b.cost >= :first AND b.cost <= :second";
		Query query = em.createQuery(sql);
		query.setParameter("first", min);
		query.setParameter("second", max);
		return query.getResultList();
	
	}
	public Author getAuthor(Integer bookId) {
		Book book = em.find(Book.class, bookId);
		if(book!=null) {
			return book.getAuthor();
		}
		return null;
	}
	public List<Book> getBooks(){
		String sql = "select b from Book b";
		Query query = em.createQuery(sql);
		return query.getResultList();
	}
	

	
}
