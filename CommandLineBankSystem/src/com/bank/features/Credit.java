package com.bank.features;

public class Credit {
//addition of money in the account
	
	public int creditMoney(int amontToCredit){
		
		int moneyInTheAccount=100000;
		int sum  = moneyInTheAccount + amontToCredit;
		moneyInTheAccount = sum;
		
		return sum;
	}
	
}
