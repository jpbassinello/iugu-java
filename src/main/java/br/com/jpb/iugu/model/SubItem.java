package br.com.jpb.iugu.model;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;

public final class SubItem implements Serializable {
	private String id;
	private String description;
	private int quantity;
	@JsonProperty("price_cents")
	private long priceCents;
	private Boolean recurrent;
	private String price;
	private String total;
	@JsonProperty("_destroy")
	private Boolean destroy;
}
