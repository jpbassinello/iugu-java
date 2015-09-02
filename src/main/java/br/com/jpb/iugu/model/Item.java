package br.com.jpb.iugu.model;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;

public final class Item implements Serializable {
	private String id;
	private String description;
	private int quantity;
	@JsonProperty("price_cents")
	private long priceCents;
	@JsonProperty("created_at")
	private Date createdAt;
	@JsonProperty("updated_at")
	private Date updatedAt;
	private String price;
	@JsonProperty("_destroy")
	private Boolean destroy;
}
