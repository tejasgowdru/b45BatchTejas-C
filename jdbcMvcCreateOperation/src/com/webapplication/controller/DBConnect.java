package com.webapplication.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	public static Connection initializeDatabase() throws SQLException, ClassNotFoundException
	{
		String dbDriver= "com.mysql.cj.jdbc.Driver";
		String dburl = "jdbc:mysql:// localhost:3306/";
		String dbName="test";
		String dbUsername="root";
		String dbPassword="9886466314Teju@";
		Class.forName(dbDriver);
		Connection con= DriverManager.getConnection(dburl+dbName, dbUsername,dbPassword);
		
		return con;
		
	}

}
