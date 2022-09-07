package com.example.demo;

public class Promos {
	private final String iconUrl;
	private final String title;
	private final String subtitle;
	private final String actionAndParams;

	public Promos(String iconUrl, String title, String subtitle, String actionAndParams) {
		super();
		this.iconUrl = iconUrl;
		this.title = title;
		this.subtitle = subtitle;
		this.actionAndParams = actionAndParams;
	}

	public String getIconUrl() {
		return iconUrl;
	}

	public String getTitle() {
		return title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public String getActionAndParams() {
		return actionAndParams;
	}

}
