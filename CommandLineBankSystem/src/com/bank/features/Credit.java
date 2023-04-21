package com.bank.features;


import com.bank.dao.SqlDao;

//addition of money in the account
public class Credit {
	
	public long creditMoney(long amountToCredit,long accountNumber) throws Exception{
		
		SqlDao sd = new SqlDao();
		long amountInAccount = sd.fetchAmountInAccount(accountNumber);
		
		long sum = amountInAccount + amountToCredit;
		
		sd.insertValuesInDb(accountNumber,sum);
		return sum;
	}
	
}
