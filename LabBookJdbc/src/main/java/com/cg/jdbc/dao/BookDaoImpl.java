package com.cg.jdbc.dao;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.cg.jdbc.dto.Book;
//import com.cg.jdbc.service.BookService;
import com.cg.jdbc.exceptionlayer.MyException;
import com.cg.jdbc.util.DBUtil;

public class BookDaoImpl implements BookDao {
	
	private static Connection connection;
	private static PreparedStatement ps;
	private static ResultSet rs;
	private static Logger myLogger;
	
	static {
		Properties props = System.getProperties();
		String userDir = props.getProperty("user.dir")+"/src/main/resources/";
		System.out.println("Current working directory is " +userDir);
	  	  PropertyConfigurator.configure(userDir+"log4j.properties");
			myLogger=Logger.getLogger("BookDaoImpl.class");
	}
	
	static {
		try {
			connection= DBUtil.getConnection();
		} catch (MyException e) {
			myLogger.error("Connection not obtained at EmployeeDao : e");
			//System.out.print("Connection Not Obtained at EmployeeDao");
		}
	}
	

	@Override
	public Book addBook(Book book, BigInteger authorId) {
		// TODO Auto-generated method stub
		String sql="insert into book(book_Title,book_Cost,author_id) values(?,?,?)";
		try {
			ps=connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, book.getBook_Title());
			ps.setDouble(2,book.getBook_Cost());
			ps.setLong(3, authorId.longValue());
			rs=ps.getGeneratedKeys();
			if(rs.next()) {
				book.setIsbn(BigInteger.valueOf(rs.getLong(1)));
			}
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			
		}finally {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("error while closing");
			}
		}
		return book;
	}

	@Override
	public Book deleteBook(BigInteger bookId) {
		// TODO Auto-generated method stub
		String sql="delete from book where isbn=?";
		try {
			ps=connection.prepareStatement(sql);
			ps.setLong(1, bookId.longValue());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error while connecting");
		}finally {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("error while closing in book dao");
			}
		}
		
		return null;
	}

	@Override
	public int updateBooksPrice(BigInteger authorId,Double cost) {
		// TODO Auto-generated method stub
	
		String sql="update book set book_cost=? where author_Id=?";
		int rec=0;
		try {
			ps=connection.prepareStatement(sql);
			ps.setLong(2, authorId.longValue());
			ps.setDouble(1, cost);
			rec=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return rec;
		
		
	}

	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<Book>();
		String sql="select * from book ";
		try {
			ps=connection.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				Book book = new Book();
				book.setIsbn(BigInteger.valueOf(rs.getLong(1)));
				book.setBook_Cost(rs.getDouble("book_cost"));
				book.setBook_Title(rs.getString("book_title"));
				books.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
			   System.out.println("error in closing");
			}
		}
		return books;
	}
	
	

}
