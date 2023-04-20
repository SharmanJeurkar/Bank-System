package com.bank.features;

import com.bank.dao.Credit_Dao;

//addition of money in the account
public class Credit {
	
	public long creditMoney(long amountToCredit,long accountNumber) throws Exception{
		
		Credit_Dao cd  = new Credit_Dao();
		long amountInAccount = cd.fetchAmountInAccount(accountNumber);
		
		long sum = amountInAccount + amountToCredit;
		
		cd.insertValuesInDb(accountNumber,sum);
		return sum;
	}
	
}
