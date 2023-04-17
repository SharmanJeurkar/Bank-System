package com.bank.features;

public class Credit {
	int moneyInTheAccount=100000;
//addition of money in the account
	
	public int creditMoney(int amontToCredit){
		
		
		int sum  = moneyInTheAccount + amontToCredit;
		moneyInTheAccount = sum;
		
		return sum;
	}
	
}
