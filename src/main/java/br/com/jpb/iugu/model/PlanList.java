package br.com.jpb.iugu.model;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public final class PlanList implements Serializable {
	@JsonProperty("totalItems")
	private int totalItems;
	private List<Plan> items;
}
