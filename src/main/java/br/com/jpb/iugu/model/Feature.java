package br.com.jpb.iugu.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;

public final class Feature implements Serializable {
	private String id;
	private String name;
	private String identifier;
	private String important;
	@JsonProperty("plan_id")
	private String planId;
	private int position;
	private BigDecimal value;
	@JsonProperty("created_at")
	private Date createdAt;
	@JsonProperty("updated_at")
	private Date updatedAt;
}
