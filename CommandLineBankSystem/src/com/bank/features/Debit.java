package com.bank.features;


public class Debit {
//deposition of money
	
	public int moneyDeposit(int moneyToDebit) {
		Credit credit =new Credit();
		int sum=credit.moneyInTheAccount;
		
		int amountLeft = sum-moneyToDebit;
		sum=amountLeft;
		return sum;
	}

}
