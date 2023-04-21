package com.bank.auth;

import java.util.Scanner;

public class Login {
	
	public boolean login() {
		
		Scanner obj = new Scanner(System.in);
		String uname = "root";
		String upass = "root";
		
		System.out.println("Username: ");
		String iuname = obj.next();
		
		System.out.println("Password: ");
		String ipass = obj.next();
		
		/*
		 * System.out.println(iuname.equals(uname));
		 * System.out.println(upass.equals(upass));
		 */
		
		if(iuname.equals(uname)&& upass.equals(ipass)) {
			System.out.println("Login Succesfull......");
			return true;
		}else {
			System.err.println("Login unsucessfull...........");
			return false;
		}
		
	}

}
