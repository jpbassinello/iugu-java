package br.com.jpb.iugu.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;

public final class Feat implements Serializable {
	private String name;
	private int value;
}
