package com.bank.features;

import java.util.Scanner;

public class Home {
	
	Scanner scanner = new Scanner(System.in);
	String creditoption = "Credit";
	String debitOption = "Debit";
	
	public void printFeatures() {
		String features[]= {creditoption, debitOption};
		for(int i =0; i<features.length;i++) {
			System.out.println(features[i]);
		}
		
	}
	
public void selectFeature() throws Exception {
		
		System.out.println("Select one of the above options");
		String selectedOption = scanner.nextLine();
		
		
		
		
		if(selectedOption.equalsIgnoreCase(creditoption)) {
			Credit credit = new Credit();
			System.out.println("Input the amount to be credited: ");
			long amountToCredit =  scanner.nextLong();
			System.out.println("Account Number: ");
			long accountNumber = scanner.nextLong();
			long sum = credit.creditMoney(amountToCredit, accountNumber);
			
			
			System.out.println("Total Money after crediting: " + sum);
		}
		else if(selectedOption.equalsIgnoreCase(debitOption)) {
			Debit db = new Debit();
			System.out.println("Input the amount to be debited: ");
			long amountToDebit =  scanner.nextLong();
			System.out.println("Account Number: ");
			long accountNumber = scanner.nextLong();
			long sum = db.moneyDeposit(amountToDebit, accountNumber);
			System.out.println("Total Money after debiting: " + sum);
			
		}
	}
	
}
