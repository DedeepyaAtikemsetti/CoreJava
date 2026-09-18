package com.hello;

public class Bankacc {
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
		Bankacc a1 = new Bankacc();
		a1.deposit(500);
		a1.withdraw(300);

	}
}
