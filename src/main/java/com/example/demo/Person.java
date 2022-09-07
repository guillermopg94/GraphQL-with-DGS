package com.example.demo;

public class Person {
	private final String completeName;
	private final String userName;

	public Person(String completeName, String userName) {
		super();
		this.completeName = completeName;
		this.userName = userName;
	}

	public String getCompleteName() {
		return completeName;
	}

	public String getUserName() {
		return userName;
	}

}
