package com.example.lwcurrencyconvert.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lwcurrencyconvert.service.CurrencyConvertService;

@RestController
@RequestMapping("/convert")
public class CurrencyConvertController {
	
	@Autowired
	CurrencyConvertProxy currencyConvertProxy;
	
	@Autowired
	CurrencyConvertService currencyConvertService;
	
	@GetMapping("/getConvertedAmount/countryCode/{countryCode}/amount/{amount}")
	public ResponseEntity<Double> convertCurrency(@PathVariable("countryCode")String countryCode,@PathVariable("amount") Double amount)
	{
		Double conversionFactor = currencyConvertProxy.getConversionFactor(countryCode);
		Double convertedAmount = currencyConvertService.convertCurrency(amount, conversionFactor);
		if(convertedAmount!=null)
		{
			return new ResponseEntity<Double>(convertedAmount,HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<Double>(HttpStatus.NOT_FOUND);
		}
	}
}
