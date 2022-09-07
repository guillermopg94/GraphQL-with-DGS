package com.example.demo;

public class LastTransaction {
	private final String category;
	private final String chargeDate;
	private final String description;
	private final String amount;

	public LastTransaction(String category, String chargeDate, String description, String amount) {
		super();
		this.category = category;
		this.chargeDate = chargeDate;
		this.description = description;
		this.amount = amount;
	}

	public String getCategory() {
		return category;
	}

	public String getChargeDate() {
		return chargeDate;
	}

	public String getAmount() {
		return amount;
	}

	public String getDescription() {
		return description;
	}

}
