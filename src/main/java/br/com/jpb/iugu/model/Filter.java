package br.com.jpb.iugu.model;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;

public final class Filter implements Serializable {
	private Integer limit;
	private Integer start;
	@JsonProperty("created_at_from")
	private Date createdAtFrom;
	@JsonProperty("created_at_to")
	private Date createdAtTo;
	@JsonProperty("due_date")
	private String dueDate;
	private String query;
	@JsonProperty("updated_since")
	private Date updatedSince;
	@JsonProperty("sortBy")
	private String sortBy;
	@JsonProperty("customer_id")
	private String customerId;
}
