package br.com.jpb.iugu.model;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;

public final class Log implements Serializable {
	private String id;
	private String description;
	private String notes;
	@JsonProperty("created_at")
	private Date createdAt;
	@JsonProperty("_destroy")
	private Boolean destroy;
}