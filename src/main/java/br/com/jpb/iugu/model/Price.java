package br.com.jpb.iugu.model;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;

public final class Price implements Serializable {
	private String id;
	private String currency = "BRL";
	@JsonProperty("plan_id")
	private String planId;
	@JsonProperty("value_cents")
	private long valueCents;
	@JsonProperty("created_at")
	private Date createdAt;
	@JsonProperty("updated_at")
	private Date updatedAt;
}
