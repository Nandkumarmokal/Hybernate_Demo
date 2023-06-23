package com.ServiceIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.CountryDao;
import com.Entity.Country;
import com.Service.CountryService;

@Service
public class CountryServiceIMPL implements CountryService{
	
	@Autowired
	private CountryDao Dao;

	@Override
	public boolean saveCountry(Country country) {
		boolean IsAdded = Dao.saveCountry(country);
		return IsAdded;
	}

	@Override
	public Country updateCountry(Country country) {
		Country updated = Dao.updateCountry(country);
		return updated;
	}

}
