package com.bank.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * This class will fetch the value from the data base for the given account id.
 * The fetched value will be passed on to the credit class in features package.
 * The amount will be summed up with the amount to add by the user and will be stored as sum.
 * The sum will be again altered and inserted in the Database table of user account. 
 * 
 */
public class Credit_Dao {
	
	Connector connector =  new Connector();
	Connection connection; 
	Statement st;
	ResultSet rs;
	
	//Fetching  the amount in user's account with the help of user's account number(unique key)
	public long fetchAmountInAccount(long accountNumber) throws Exception {
		
		String query = "select * from user_account where Account_Number = " + accountNumber;
		connection = connector.Connect();
		
		st = connection.createStatement();
		rs=st.executeQuery(query);
		
		rs.next();
		Long ammountInAccount = rs.getLong(3);
		
		return ammountInAccount;
	}

}
