package br.com.jpb.iugu.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public final class Address implements Serializable {
	private String street;
	private Integer number;
	private String city;
	private String state;
	private String country;
	@JsonProperty("zip_code")
	private String zipCode;
}
