package com.bank;

import com.bank.auth.Login;
import com.bank.features.Home;

public class Main {
	
	public static void main(String[] args) {
		Login obj1 = new Login();
		Home home = new Home();
		
		obj1.login();
		
		if(obj1.login() == true) {
			home.printFeatures();
		}
		
	}
	
}
