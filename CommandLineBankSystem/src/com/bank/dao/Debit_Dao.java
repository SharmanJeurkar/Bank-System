package com.bank.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * This class will fetch the value from the data base for the given account id.
 * The fetched value will be passed on to the debit class in features package.
 * The amount will be subtracted from the amount to debit by the user and will be stored as sum.
 * The sum will be again be inserted in the Database table of user account. 
 * 
 */

public class Debit_Dao {
	
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
