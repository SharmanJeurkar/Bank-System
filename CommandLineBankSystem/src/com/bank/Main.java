package com.bank;

import com.bank.auth.Login;
import com.bank.features.Home;

public class Main {
	
	public static void main(String[] args) throws Exception {
		Login obj1 = new Login();
		Home home = new Home();
		
		boolean loginSuccesfull = obj1.login();
		
		
		if( loginSuccesfull) {
			home.printFeatures();
			home.selectFeature();
		}else {
			for(int i=2; i<=6; i++) {
				
				
				 if(i<=5) { 
					 System.out.println("Retry logging in..... Attempt "+i);
					 loginSuccesfull=obj1.login(); 
					 
					 if(loginSuccesfull) {
						 home.printFeatures(); 
						 home.selectFeature();
						 break;
						 } 
					 }
				 else {
						 System.err.println("Login credentials aren't correct!"); 
						 System.exit(1);
						 return; 
					}
				 
			}
			
		}
		
	}
	
}
