package com.bcore.model;

public class ATM {

	public static void main(String[] args) {
			
//		Account account1 = new Account();
//		account1.getAccountDetails();
//		
//		Account account2 = new Account(1002,"cust2","savings",100000);
//		account2.getAccountDetails();
//		account2.withdraw(5000);
//		account2.getAccountDetails();
//		account1.createAccount(1001, "cust1", "savings", 10000);		
//		double currentBalance = account1.getBalance();
//		System.out.println("Current Balance " + currentBalance);
//		if (currentBalance > 10000) {
//			double newBalance = account1.withdraw(5000);
//		} else {
//			System.out.println("Account balance is low");
//		}
//		System.out.println("New Balance " + account1.getBalance());
		
		Account sAccount = new SavingsAccount();
		sAccount.setAccountNumber(1001);
		sAccount.setAccountType("savings");
		sAccount.setBalance(1000);
		
		double newBalance = sAccount.getInterest();
		System.out.println(newBalance);
		sAccount.withdraw(500);
	}
}
