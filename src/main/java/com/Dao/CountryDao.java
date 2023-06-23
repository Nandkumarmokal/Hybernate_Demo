package com.Dao;

import com.Entity.Country;

public interface CountryDao {

	public boolean saveCountry(Country country);

	public Country updateCountry(Country country);

}
