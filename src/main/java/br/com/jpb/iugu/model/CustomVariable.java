package br.com.jpb.iugu.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public final class CustomVariable implements Serializable {
	private String id;
	private String name;
	private String value;
	@JsonProperty("_destroy")
	private Boolean destroy;
}