package br.com.jpb.iugu.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public final class Data implements Serializable {
	private long number;
	@JsonProperty("verification_value")
	private int verificationValue;
	@JsonProperty("first_name")
	private String firstName;
	@JsonProperty("last_name")
	private String lastName;
	private String month;
	private int year;
	@JsonProperty("display_number")
	private String displayNumber;
	private String brand;
}
