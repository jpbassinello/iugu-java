package br.com.jpb.iugu.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public final class Invoice implements Serializable {
	private String id;
	private String email;
	@JsonProperty("due_date")
	private String dueDate;
	private String currency;
	private List<Item> items;
	@JsonProperty("items_total_cents")
	private Long itemsTotalCents;
	@JsonProperty("total_cents")
	private Long totalCents;
	@JsonProperty("paid_at")
	private Date paidAt;
	@JsonProperty("secure_id")
	private String secureId;
	@JsonProperty("secure_url")
	private String secureUrl;
	private InvoiceStatus status;
	@JsonProperty("return_url")
	private String returnUrl;
	@JsonProperty("expired_url")
	private String expiredUrl;
	@JsonProperty("notification_url")
	private String notificationUrl;
	@JsonProperty("tax_cents")
	private Long taxCents;
	private Boolean fines;
	@JsonProperty("late_payment_fine")
	private Long latePaymentFine;
	@JsonProperty("per_day_interest")
	private Boolean perDayInterest;
	@JsonProperty("discount_cents")
	private Long discountCents;
	@JsonProperty("customer_id")
	private String customerId;
	@JsonProperty("user_id")
	private String userId;
	@JsonProperty("ignore_due_email")
	private Boolean ignoreDueEmail;
	@JsonProperty("subscription_id")
	private String subscriptionId;
	@JsonProperty("payable_with")
	private String payableWith;
	private Long credits;
	private String total;
	@JsonProperty("taxes_paid")
	private String taxesPaid;
	private String interest;
	private String discount;
	@JsonProperty("created_at")
	private Date createdAt;
	@JsonProperty("updated_at")
	private Date updatedAt;
	private String refundable;
	private String installments;
	private List<Log> logs;
	@JsonProperty("custom_variables")
	private List<CustomVariable> customVariables;
	private BankSlip bankSlip;
}
