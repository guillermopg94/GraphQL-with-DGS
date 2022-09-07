package com.example.demo;

import java.util.List;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;

@DgsComponent
public class PromosDatafetcher {
	private final List<Promos> promos = List.of(
			new Promos("http://www.iconsweb.com", "Stranger Things", "An 80's inspired Terror serie", "2345"),
			new Promos("http://www.iconsSecondWeb.com", "Stranger Things", "Te same serie", "5678"),
			new Promos("http://www.iconswebsite.com", "Stranger Things", "Another time the same", "34"));

	@DgsQuery
	public List<Promos> promos() {
		return promos;

	}
}
