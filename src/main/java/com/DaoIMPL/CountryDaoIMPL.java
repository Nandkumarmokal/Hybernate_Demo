package com.DaoIMPL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Dao.CountryDao;
import com.Entity.Country;


@Repository
public class CountryDaoIMPL implements CountryDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean saveCountry(Country country) {
		boolean IsAdded = false;
		
		try(Session session = sessionFactory.openSession();){
			
			Transaction transaction = session.beginTransaction();
			session.save(country);
			transaction.commit();
			IsAdded = true;
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return IsAdded;
	}

	@Override
	public Country updateCountry(Country country) {
		String Add = null;
try(Session session = sessionFactory.openSession();){
			
			Country dbcountry =getById(country.getCid());
			session.update(country);
			System.out.println(country);
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return country;
	}

	private Country getById(double cid) {
		Country country = null;
		
try(Session session = sessionFactory.openSession();){
			
			country =session.get(Country.class, cid);
					
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return country;
	}

}
