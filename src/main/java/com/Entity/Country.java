package com.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Country {
	
	@Id
	private double cid;
	private String cname;
	
	public Country()
	{
		
	}
	
	public double getCid() {
		return cid;
	}

	public void setCid(double cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Country(double cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Country [cid=" + cid + ", cname=" + cname + "]";
	}
	

}
