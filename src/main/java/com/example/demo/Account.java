package com.example.demo;

import java.util.List;

public class Account {
	private final String balance;
	private final String accountCurrency;
	private final List<LastTransaction> lastTransactions;

	public Account(String balance, String accountCurrency, List<LastTransaction> lastTransaction) {
		super();
		this.balance = balance;
		this.accountCurrency = accountCurrency;
		this.lastTransactions = lastTransaction;
	}

	public String getBalance() {
		return balance;
	}

	public String getAccountCurrency() {
		return accountCurrency;
	}

	public List<LastTransaction> getLastTransactions() {
		return lastTransactions;
	}

}
