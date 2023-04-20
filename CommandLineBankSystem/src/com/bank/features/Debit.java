package com.bank.features;

import com.bank.dao.Debit_Dao;

public class Debit {
//deposition of money
	
	public long moneyDeposit(long moneyToDebit, long accountNumber) throws Exception {
		
		Debit_Dao da = new Debit_Dao();
		long moneyInAccount = da.fetchAmountInAccount(accountNumber);	
		long sum = moneyInAccount - moneyToDebit;
		
		da.insertValuesInDb(accountNumber, sum);
		return sum;
	}
}


