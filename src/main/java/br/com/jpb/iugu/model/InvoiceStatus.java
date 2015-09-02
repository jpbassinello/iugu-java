package br.com.jpb.iugu.model;

import org.codehaus.jackson.annotate.JsonValue;

public enum InvoiceStatus {
	DRAFT("Draft"),
	PENDING("Pending"),
	PARTIALLY_PAID("Partially_paid"),
	PAID("Paid"),
	CANCELED("Canceled"),
	REFUNDED("Refunded"),
	EXPIRED("Expired");

	private final String jsonValue;

	private InvoiceStatus(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@JsonValue
	public String getJsonValue() {
		return jsonValue;
	}
}