package com.example.lwcurrencyconvert.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="lw-conversion",url="localhost:8081/conversionFact")
public interface CurrencyConvertProxy {
	
	@RequestMapping("/getConversionFactor/countryCode/{countryCode}")
	public Double getConversionFactor(@PathVariable("countryCode")String countryCode);

}
