package com.example.demo;

import java.util.List;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;

@DgsComponent
public class LastTransactionDatafetcher {

	private final List<LastTransaction> lastTransaction = List.of(
			new LastTransaction("1", "01/02/2021", "Stranger Things", "34"),
			new LastTransaction("2", "12/03/2022", "Things", "21"),
			new LastTransaction("3", "02/05/2020", "Stranger", "120"));

	@DgsQuery
	public List<LastTransaction> lastTransactions() {

		return lastTransaction;

	}

}
