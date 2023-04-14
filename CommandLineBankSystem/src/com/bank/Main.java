package com.bank;

import com.bank.auth.Login;
import com.bank.features.Home;

public class Main {
	
	public static void main(String[] args) {
		Login obj1 = new Login();
		Home home = new Home();
		
		boolean loginSuccesfull = obj1.login();
		
		if( loginSuccesfull== true) {
			home.printFeatures();
		}else {
			for(int i=0; i<=5; i++) {
				if(i<5) {
					System.out.println("Retry logging in..... Attempt "+i);
					obj1.login();
				}else {
					System.err.println("Login credentials aren't correct!");
					System.exit(1);
					return;
				}
			}
			
		}
		
	}
	
}
