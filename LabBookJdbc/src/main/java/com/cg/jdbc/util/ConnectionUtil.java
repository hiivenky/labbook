/**
 * 
 */
package com.cg.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.cg.jdbc.exceptionlayer.MyException;



/**
 * @author rvikash
 *
 */
public class ConnectionUtil {
	private static Connection connection;
	public static Connection getConnection() throws MyException{
		String url="jdbc:mysql://localhost:3306/labbook";
		String user="root";
		String password="root";
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			throw new MyException("error while connecting yo database");
		} /*catch (ClassNotFoundException e) {
			throw new MyException("Error while obatining Connection ");
		}*/
		return connection;
	}
	public static void main(String[] args) throws MyException {
		connection=ConnectionUtil.getConnection();
		if(connection!=null) System.out.println("Connection Obtained!!");
		else System.out.println("Connection NOT Obtained!!");
	}

}
