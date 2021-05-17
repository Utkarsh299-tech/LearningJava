package com.mycompany;

public class Main {

    public static void main(String[] args) {
	    BankAccount bankAccount = new BankAccount();
	    bankAccount.accountHolderName = "Utkarsh Singh";
	    bankAccount.setBalance(0);
	    bankAccount.setPhoneNumber("8405986693");
	    bankAccount.setEmailId("singhutkarsh2799@gmail.com");

	    bankAccount.openAccount();
	    bankAccount.checkBalance();

	    bankAccount.addMoney(1000);
	    bankAccount.withdrawMoney(500);

	    bankAccount.checkBalance();
	    bankAccount.withdrawMoney(2000);
    }
}
