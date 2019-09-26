package com.cg.jdbc.ui;

import java.math.BigInteger;
import java.util.List;
import java.util.Scanner;

import com.cg.jdbc.dto.Author;
import com.cg.jdbc.dto.Book;
import com.cg.jdbc.service.AuthorService;
import com.cg.jdbc.service.AuthorServiceImpl;
import com.cg.jdbc.service.BookService;
import com.cg.jdbc.service.BookServiceImpl;
import com.google.protobuf.Service;

public class MyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to books and authors ");
		
		System.out.println("1. for viewing all authors");
		System.out.println("2. for viewing all books");
		System.out.println("3. for adding author");
		System.out.println("4. for deleting author");
		System.out.println("5. for adding book");
		System.out.println("6. for deleting book");
		System.out.println("7. modify prices of books by perticular author");
		System.out.println("8. exit");
		
		AuthorService authorService = new AuthorServiceImpl();
		BookService bookService = new BookServiceImpl();
		
		int option= 0;
		
		while(option!=8) {
		
			option=sc.nextInt();
		switch(option) {
		
		case 1: 
			  List<Author> authors= authorService.getAuthors();
			  for(int i=0;i<authors.size();i++) {
				  System.out.println(authors.get(i));
			  }
			  break;
		case 2:
			List<Book> books= bookService.getBooks();
			  for(int i=0;i<books.size();i++) {
				  System.out.println(books.get(i));
			  }
			  break;
		case 3:
			String fname=sc.next();
			String lname=sc.next();
			Author author = new Author(fname,lname);
			System.out.println(authorService.addAuthor(author));
			break;
		case 4:
			List<Author> authorsList= authorService.getAuthors();
			  for(int i=0;i<authorsList.size();i++) {
				  System.out.println(authorsList.get(i));
			  }
			  System.out.println("Enter the author id you want to delete");
			  BigInteger id=BigInteger.valueOf(sc.nextLong());
			  authorService.deleteAuthor(id);
			  break;
		case 5:
			sc.nextLine();
			String bookTitle=sc.nextLine();
			Double bookCost=sc.nextDouble();
			List<Author> authorsList1= authorService.getAuthors();
			  for(int i=0;i<authorsList1.size();i++) {
				  System.out.println(authorsList1.get(i));
			  }
			  System.out.println("Enter the author_id");
			  id=BigInteger.valueOf(sc.nextLong());
			  bookService.addBook(new Book(bookTitle,bookCost), id);
			  break;
		case 6:
			List<Book> books1= bookService.getBooks();
			  for(int i=0;i<books1.size();i++) {
				  System.out.println(books1.get(i));
			  }
			  bookService.deleteBook(BigInteger.valueOf(sc.nextLong()));
			  break;
		case 7:
			System.out.println("Enter the author id to change prices");
			id=BigInteger.valueOf(sc.nextInt());
			System.out.println("Enter the cost to be updated");
			double cost=sc.nextDouble();
			bookService.updateBooksPrice(id, cost);
			break;
		case 8:
			System.out.println("Thank You");
			break;
		default:
			System.out.println("Wrong option");
			
	}
		}
		
		
		

	}

}
