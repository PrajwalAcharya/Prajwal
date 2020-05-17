package com.ibm.lwconversion.service;

import com.ibm.lwconversion.model.ConversionFact;

public interface ConversionFactService {
	
	public ConversionFact addConversionFactor(ConversionFact conversionFact);
	
	public ConversionFact updateConversionFactor(Double conversionFactor, String countryCode);
	
	public Double getConversionFactor(String countryCode);

}
