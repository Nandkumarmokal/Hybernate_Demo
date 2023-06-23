package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.Country;
import com.Service.CountryService;

@RestController
@RequestMapping(value="/country")
public class CountryController {
	
	@Autowired
	private CountryService service;
	
	
	@RequestMapping(value="/save-country")
	public boolean saveCountry(@RequestBody Country country){
		
		boolean IsAdded = service.saveCountry(country);
		
		return IsAdded;
	}
	
	@RequestMapping(value="/update-country")
	public Country updateCountry(@RequestBody Country country){
		Country updated = service.updateCountry(country);
		return updated;
		
	}

}
