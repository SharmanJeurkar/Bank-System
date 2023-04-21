package com.bank.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqlDao {
	
	Connector connector =  new Connector();
	Connection connection;
	Statement st;
	ResultSet rs;
	
	public long fetchAmountInAccount(long accountNumber) throws Exception {
			
			String query = "select * from user_account where Account_Number = " + accountNumber;
			connection = connector.Connect();
			
			st = connection.createStatement();
			rs=st.executeQuery(query);
			
			rs.next();
			Long ammountInAccount = rs.getLong(3);
			
			return ammountInAccount;
		}

	public  void insertValuesInDb(long accountNumber,long sum) throws Exception {
		String query =  "update user_account set  Amount_IN_Account="+sum+" where Account_Number= "+accountNumber+";";
		st=connection.createStatement();
		st.executeUpdate(query);
		
		System.out.println("Account updated....");
	}


}
