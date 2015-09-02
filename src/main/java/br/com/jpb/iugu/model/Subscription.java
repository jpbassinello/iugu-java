package br.com.jpb.iugu.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public final class Subscription implements Serializable {
	private String id;
	private Boolean suspended;
	@JsonProperty("plan_identifier")
	private String planIdentifier;
	@JsonProperty("plan_name")
	private String planName;
	@JsonProperty("plan_ref")
	private String planRef;
	@JsonProperty("expires_at")
	private Date expiredAt;
	@JsonProperty("only_on_chage_success")
	private Boolean onlyOnChargeSuccess;
	@JsonProperty("payable_with")
	private String payableWith;
	private Integer credits;
	@JsonProperty("credits_based")
	private Boolean creditsBased;
	private String currency = "BRL";
	@JsonProperty("price_cents")
	private long priceCents;
	@JsonProperty("cycled_at")
	private Date cycledAt;
	@JsonProperty("credits_cycle")
	private Integer creditsCycle;
	@JsonProperty("credits_min")
	private Integer creditsMin;
	@JsonProperty("created_at")
	private Date createdAt;
	@JsonProperty("updated_at")
	private Date updatedAt;
	@JsonProperty("customer_id")
	private String customerId;
	@JsonProperty("customer_name")
	private String customerName;
	@JsonProperty("customer_email")
	private String customerEmail;
	@JsonProperty("customer_ref")
	private String customerRef;
	private Boolean active;
	@JsonProperty("recent_invoices")
	private List<Invoice> recentInvoices;
	@JsonProperty("in_trial")
	private Boolean inTrial;
	private List<SubItem> subitems;
	@JsonProperty("custom_variables")
	private List<CustomVariable> customVariables;
	private List<Log> logs;
	private SubscriptionFeature features;
}
