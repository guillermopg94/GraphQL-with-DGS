package com.example.demo;

import java.util.List;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;

@DgsComponent
public class OperationsDatafetcher {
	private final List<Operations> operations = List.of(new Operations("1"), new Operations("2"), new Operations("3"));

	@DgsQuery
	public List<Operations> operations() {

		return operations;

	}

}
