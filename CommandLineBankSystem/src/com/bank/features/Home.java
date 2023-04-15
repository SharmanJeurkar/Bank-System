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
	
public void selectFeature() {
		
		System.out.println("Select one of the above options");
		String selectedOption = scanner.nextLine();
		
		
		
		if(selectedOption.equalsIgnoreCase(creditoption)) {
			System.out.println("Hello credit");
		}
		else if(selectedOption.equalsIgnoreCase(debitOption)) {
			System.out.println("Hello debit");
		}
	}
	
}
