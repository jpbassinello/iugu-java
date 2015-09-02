package br.com.jpb.iugu.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public final class PaymentMethod implements Serializable {
	private String id;
	@JsonProperty("customer_id")
	private String customerId;
	private String description;
	private Data data;
	@JsonProperty("item_type")
	private String itemType;
	private String token;
	@JsonProperty("set_as_default")
	private Boolean setAsDefault;
}
