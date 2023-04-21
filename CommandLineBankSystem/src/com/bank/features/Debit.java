package com.bank.features;


import com.bank.dao.SqlDao;

public class Debit {
//deposition of money
	
	public long moneyDeposit(long moneyToDebit, long accountNumber) throws Exception {
		
		SqlDao sd = new SqlDao();
		long moneyInAccount = sd.fetchAmountInAccount(accountNumber);	
		long sum = moneyInAccount - moneyToDebit;
		
		sd.insertValuesInDb(accountNumber, sum);
		return sum;
	}
}


