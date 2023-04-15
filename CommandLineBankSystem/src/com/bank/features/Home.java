package com.bank.features;

import java.util.Scanner;

public class Home {
	
	Scanner scanner = new Scanner(System.in);
	String features[]= {"Credit", "Debit","Delete account"};
	
	public void printFeatures() {
		
		for(int i =0; i<features.length;i++) {
			System.out.println(features[i]);
		}
		
	}
	
	public void selectFeature() {
		
		System.out.println("Select one of the above options");
		String selectedOption = scanner.nextLine();
		
		for (String string : features) {
		
		if(selectedOption.equalsIgnoreCase(string = "Credit")) {
			System.out.println("Hello credit");
		}
		
		}
	}
	
}
