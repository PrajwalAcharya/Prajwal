package com.ibm.lwconversion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.lwconversion.model.ConversionFact;
import com.ibm.lwconversion.repository.ConversionFactRepo;

@Service
public class ConversionFactServiceImpl implements ConversionFactService{
	
	@Autowired
	ConversionFactRepo conversionFactRepo;
	
	public ConversionFact addConversionFactor(ConversionFact conversionFact)
	{
		conversionFactRepo.save(conversionFact);
		return conversionFact;
	}

	public ConversionFact updateConversionFactor(Double conversionFactor, String countryCode) {
		
		ConversionFact conversionFact = conversionFactRepo.findByConversionFactor(conversionFactor,countryCode);
		if (conversionFact.getCountryCode().equalsIgnoreCase("INR"))
		{
			conversionFact.setConversionFactor(conversionFactor+2.0);
			conversionFactRepo.save(conversionFact);
		}
		return conversionFact;
	}

	public Double getConversionFactor(String countryCode) {
		
		return conversionFactRepo.findConversionFactorByCountryCode(countryCode);
	}

}
