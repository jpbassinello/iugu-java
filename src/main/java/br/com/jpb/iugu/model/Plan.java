package br.com.jpb.iugu.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public final class Plan implements Serializable {
	private String id;
	private String name;
	private String identifier;
	private int interval;
	@JsonProperty("interval_type")
	private IntervalType intervalType;
	private String currency = "BRL";
	@JsonProperty("value_cents")
	private long valueCents;
	@JsonProperty("payable_with")
	private String payableWith;
	@JsonProperty("created_at")
	private Date createdAt;
	@JsonProperty("updated_at")
	private Date updatedAt;
	private List<Price> prices;
	private List<Feature> features;
}
