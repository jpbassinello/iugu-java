package br.com.jpb.iugu.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public final class Customer implements Serializable {
	private String id;
	@JsonProperty("cpf_cnpj")
	private String cpfCnpj;
	private String name;
	@JsonProperty("phone_prefix")
	private Integer phonePrefix;
	private Integer phone;
	private String email;
	@JsonProperty("cc_emails")
	private String ccEmails;
	private String notes;
	private Address address;
	@JsonProperty("created_at")
	private Date createdAt;
	@JsonProperty("updated_at")
	private Date updatedAt;
	@JsonProperty("default_payment_method_id")
	private String defaultPaymentMethodId;
	@JsonProperty("custom_variables")
	private List<CustomVariable> customVariables;
}