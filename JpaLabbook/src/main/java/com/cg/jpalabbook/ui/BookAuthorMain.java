package com.cg.jpalabbook.ui;

import java.util.List;
import java.util.Scanner;

import com.cg.jpalabbook.dto.Author;
import com.cg.jpalabbook.dto.Book;
import com.cg.jpalabbook.service.BookService;
import com.cg.jpalabbook.service.BookServiceImpl;

public class BookAuthorMain {
	
public static void main(String[] args) {
	Scanner scr  = new Scanner(System.in);
	BookService service = new BookServiceImpl();
	List<Book> books =service.getBooks();
	for(int i=0;i<books.size();i++) {
		System.out.println(books.get(i).getTitle());
	}
//	System.out.println(service.getAuthor(5).getAuthorName());
}

}
