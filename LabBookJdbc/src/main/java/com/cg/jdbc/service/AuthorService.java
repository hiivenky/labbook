package com.cg.jdbc.service;

import java.math.BigInteger;
import java.util.List;

import com.cg.jdbc.dto.Author;

public interface AuthorService {
	
	public Author addAuthor(Author author);
	public Author deleteAuthor(BigInteger author);
	public Author searchAuthor(BigInteger authorId);
	public List<Author> getAuthors();

}
