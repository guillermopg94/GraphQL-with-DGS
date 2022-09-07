package com.example.demo;

import java.util.List;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;

@DgsComponent
public class PersonDatafetcher {
	private final List<Person> person = List.of(new Person("Guillermo Patón", "Guille"),
			new Person("Pablo Vega", "Pablo"), new Person("Carlos Beltrán", "Carlos"));

	@DgsQuery
	public List<Person> persons() {

		return person;

	}

}
