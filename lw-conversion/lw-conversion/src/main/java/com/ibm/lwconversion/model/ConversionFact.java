package com.ibm.lwconversion.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="conversionfact")
public class ConversionFact {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name="CountryCode")
	private String countryCode;
	
	@Column(name="ConversionFactor")
	private Double conversionFactor;

	
	public ConversionFact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConversionFact(Integer id, String countryCode, Double conversionFactor) {
		super();
		this.id = id;
		this.countryCode = countryCode;
		this.conversionFactor = conversionFactor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Double getConversionFactor() {
		return conversionFactor;
	}

	public void setConversionFactor(Double conversionFactor) {
		this.conversionFactor = conversionFactor;
	}

}
