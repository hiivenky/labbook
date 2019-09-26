package com.cg.jdbc.dao;

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

import com.cg.jdbc.dto.Author;
import com.cg.jdbc.exceptionlayer.MyException;
//import com.cg.jdbc.service.AuthorService;
import com.cg.jdbc.util.DBUtil;

public class AuthorDaoImpl implements AuthorDao {
	
	private static Connection connection;
	private static PreparedStatement ps;
	private static ResultSet rs;
	private static Logger myLogger;
	
	static {
		Properties props = System.getProperties();
		String userDir = props.getProperty("user.dir")+"/src/main/resources/";
		System.out.println("Current working directory is " +userDir);
	  	  PropertyConfigurator.configure(userDir+"log4j.properties");
			myLogger=Logger.getLogger("AuthorDaoImpl.class");
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
	public Author addAuthor(Author author) throws MyException {
		// TODO Auto-generated method stub
		String sql="insert into author(author_FirstName,author_LastName) values(?,?)";
		
		try {
			ps=connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			if(ps==null) {
				throw new MyException("eroor while connecting");
			}
			ps.setString(1, author.getAuthorFirstName());
			ps.setString(2, author.getAuthorLastName());
			
			BigInteger generated_Id=BigInteger.valueOf(0L);
			rs=ps.getGeneratedKeys();
			if(rs.next()) {
				generated_Id=BigInteger.valueOf(rs.getLong(1));
			}
			author.setAuthorId(generated_Id);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error not able to connect in authordeo");
		}
		try {
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error in updating the auther dao");
		}finally {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("eroor while closing the connection");
			}
		}
		return author;
	}

	@Override
	public Author deleteAuthor(BigInteger author) {
		// TODO Auto-generated method stub
		String sql="delete from author where author_Id=?";
		try {
			ps=connection.prepareStatement(sql);
			ps.setLong(1, author.longValue());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("errror while connecting in autherdao");
		}finally {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Eroor while closing");
			}
		}
		return null;
	}

	@Override
	public Author searchAuthor(BigInteger authorId) {
		// TODO Auto-generated method stub
		String sql="select * from author where author_Id=?";
		try {
			ps=connection.prepareStatement(sql);
			ps.setLong(1, authorId.longValue());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error while connecting in authordao");
		}finally {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Error while closing");
			}
		}
		return null;
	}
	@Override
	public List<Author> getAuthors(){
	
		String sql="select * from author";
		List<Author> authors = new ArrayList<Author>();
		
		try {
			ps=connection.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				Author author= new Author();
				author.setAuthorId(BigInteger.valueOf(rs.getLong(1)));
				author.setAuthorFirstName(rs.getString("author_FirstName"));
				author.setAuthorLastName(rs.getString("author_LastName"));
				authors.add(author);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error while connecting");
		}finally {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return authors;
		
	}

}
