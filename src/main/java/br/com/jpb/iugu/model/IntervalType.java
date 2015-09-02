package br.com.jpb.iugu.model;

import org.codehaus.jackson.annotate.JsonValue;

public enum IntervalType {
	WEEKS("weeks"),
	MONTHS("months");

	private final String jsonValue;

	private IntervalType(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@JsonValue
	public String getJsonValue() {
		return jsonValue;
	}
}