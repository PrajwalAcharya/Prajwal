package com.ibm.lwconversion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.lwconversion.model.ConversionFact;
import com.ibm.lwconversion.service.ConversionFactService;
import com.ibm.lwconversion.service.ConversionFactServiceImpl;

@RestController
@RequestMapping("/conversionFact")
public class ConversionFactorController {

	@Autowired
	ConversionFactService conversionFactService;

	@PostMapping("/addConversionFact/conversionFact")
	public ResponseEntity<ConversionFact> addConversionFactor(@RequestBody ConversionFact conversionFact  ) {
		ConversionFact conversionFactr = conversionFactService.addConversionFactor(conversionFact);
		if (conversionFactr.getId()!=null) {
			return new ResponseEntity<ConversionFact>(HttpStatus.CREATED);
		} else {
			return new ResponseEntity<ConversionFact>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/updateConversionFact/conversionFactor/{conversionFactor}/countryCode/{countryCode}")
	public ResponseEntity<String> updateConversionFactor(@PathVariable(value="conversionFactor")Double conversionFactor, @PathVariable(value="countryCode")String countryCode) {
		ConversionFact conversionFactr = conversionFactService.updateConversionFactor(conversionFactor,countryCode);
		if (conversionFactr!=null) {
			return new ResponseEntity<String>("Details updated successfully",HttpStatus.CREATED);
		} else {
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/getConversionFactor/countryCode/{countryCode}")
	public ResponseEntity<Double> getConversionFactor(@PathVariable ("countryCode") String countryCode)
	{
		Double conversionFactor = conversionFactService.getConversionFactor(countryCode);
		if (conversionFactor!=null) {
			return new ResponseEntity<Double>(conversionFactor,HttpStatus.OK);
		} else {
			return new ResponseEntity<Double>(HttpStatus.NOT_FOUND);
		}
	}

}
