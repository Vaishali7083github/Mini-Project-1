package com.asynchronization;

public class Account {
	private int balance=10000;

	public int getBalance() {
		return balance;
	}

	public int withdraw(int amount) {
		balance= balance-amount;
		return balance;
	}

}
