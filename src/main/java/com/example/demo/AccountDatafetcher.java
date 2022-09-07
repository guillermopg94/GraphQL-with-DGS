package com.example.demo;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;

import java.util.List;

@DgsComponent
public class AccountDatafetcher {

	private final List<LastTransaction> lastTransaction = List.of(
			new LastTransaction("1", "01/02/2021", "Stranger Things", "34"),
			new LastTransaction("2", "12/03/2022", "Things", "21"),
			new LastTransaction("3", "02/05/2020", "Stranger", "120"));

	private final List<Account> account = List.of(new Account("2034", "3000", lastTransaction),
			new Account("12000", "15683", lastTransaction)

	);

	@DgsQuery
	public List<Account> accounts() {

		return account;

	}

	@DgsQuery
	public List<LastTransaction> lastTransactions() {

		return lastTransaction;

	}

}
