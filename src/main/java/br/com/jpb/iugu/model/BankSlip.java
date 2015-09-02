package br.com.jpb.iugu.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public final class BankSlip implements Serializable {
	@JsonProperty("digitable_line")
	private String digitableLine;
	@JsonProperty("barcode_data")
	private String barcodeData;
	@JsonProperty("barcode")
	private String barcodeUrl;
}
