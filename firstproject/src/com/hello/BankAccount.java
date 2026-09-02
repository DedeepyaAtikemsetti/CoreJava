package com.hello;

public class BankAccount {
	int accNo;
	String accountHolderName;
	int balance;
	static int accountNoGenerator;

	{
		accNo = accountNoGenerator;
		accountNoGenerator = accountNoGenerator + 1;
	}

	public static void main(String[] args) {

		accountNoGenerator = 1;
		BankAccount u1 = new BankAccount();
		u1.accountHolderName = "Dedeepya";
		u1.balance = 10000000;
		System.out.println("accNo: " + u1.accNo + "\n" + "accountHolderName: " + u1.accountHolderName + "\n"
				+ "balance: " + u1.balance + "\n");
		BankAccount u2 = new BankAccount();
		u2.accountHolderName = "Manjula";
		u2.balance = 10000;
		System.out.println("accNo: " + u2.accNo + "\n" + "accountHolderName: " + u2.accountHolderName + "\n"
				+ "balance: " + u2.balance + "\n");
		BankAccount u3 = new BankAccount();
		u3.accountHolderName = "Yochitha";
		u3.balance = 1000000;
		System.out.println("accNo: " + u3.accNo + "\n" + "accountHolderName: " + u3.accountHolderName + "\n"
				+ "balance: " + u3.balance + "\n");

	}

}
