package com.bank.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
	
	public Connection Connect() throws Exception {
		String url="jdbc:mysql://localhost:3306/bank_system";
		String uname="root";
		String password="root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,password);
		return con;
	}

}
