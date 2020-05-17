package com.ibm.lwconversion.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ibm.lwconversion.model.ConversionFact;

@Repository
public interface ConversionFactRepo extends JpaRepository<ConversionFact,Integer> {
	
	@Query(value="SELECT * FROM CONVERSIONFACT CF WHERE CF.CONVERSION_FACTOR = ?1 AND CF.COUNTRY_CODE = ?2", nativeQuery=true)
	ConversionFact findByConversionFactor(Double conversionFactor, String countryCode );

	@Query(value="SELECT CONVERSION_FACTOR FROM CONVERSIONFACT WHERE COUNTRY_CODE=?1",nativeQuery=true)
	public Double findConversionFactorByCountryCode(String countryCode);

}
