package com.hello;

public class bankacc {
	static double balance = 1000;

	void deposit(int amount) {
		balance += amount;
		System.out.println("Amount you have in your account after deposit is: " + balance);
	}

	void withdraw(int amount) {
		balance -= amount;
		System.out.println("Amount you have in your account after withdraw is: " + balance);
	}

	public static void main(String[] args) {
		bankacc a1 = new bankacc();
		a1.deposit(500);
		a1.withdraw(300);

	}
}
