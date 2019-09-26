package com.cg.jdbc.service;

import java.math.BigInteger;
import java.util.List;

import com.cg.jdbc.dao.AuthorDao;
import com.cg.jdbc.dao.AuthorDaoImpl;
import com.cg.jdbc.dto.Author;
import com.cg.jdbc.exceptionlayer.MyException;

public class AuthorServiceImpl implements AuthorService {
	
	private AuthorDao authorDao = new AuthorDaoImpl();

	public Author addAuthor(Author author) {
		// TODO Auto-generated method stub
		try {
			return authorDao.addAuthor(author);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println("error while adding author ");
		}
		return null;
	}

	public Author deleteAuthor(BigInteger author) {
		// TODO Auto-generated method stub
		return authorDao.deleteAuthor(author);
	}

	public Author searchAuthor(BigInteger authorId) {
		// TODO Auto-generated method stub
		return authorDao.searchAuthor(authorId);
	}

	@Override
	public List<Author> getAuthors() {
		// TODO Auto-generated method stub
		return authorDao.getAuthors();
	}
	
	

	
}
