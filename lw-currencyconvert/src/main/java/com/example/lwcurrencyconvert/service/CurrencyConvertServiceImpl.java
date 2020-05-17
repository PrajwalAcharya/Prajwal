package com.example.lwcurrencyconvert.service;

import org.springframework.stereotype.Service;

@Service
public class CurrencyConvertServiceImpl implements CurrencyConvertService {

	@Override
	public Double convertCurrency(Double amount, Double conversionFactor) {
		
		Double convertedAmount = amount*conversionFactor;
		return convertedAmount;
	}

}
