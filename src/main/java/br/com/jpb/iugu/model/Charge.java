package br.com.jpb.iugu.model;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public final class Charge implements Serializable {
	private String method;
	private String token;
	@JsonProperty("customer_payment_method_id")
	private Long customerPaymentMethodId;
	@JsonProperty("customer_id")
	private Long customerId;
	@JsonProperty("invoice_id")
	private Long invoiceId;
	private String email;
	private Integer months;
	@JsonProperty("discount_cents")
	private Long discountCents;
	private List<Item> items;
	private Customer payer;

}
