package com.Entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
	
	@Id
	private double id;
	private String name;
	private String department;
	private String status;
	private int mobileNo;
	@JsonFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdDate;
	private String createdBy;
	@JsonFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedDate;
	private String updatedby;
	@OneToOne
	private Country cid;
	
	public Employee() {
		
	}
	
	public Employee(double id, String name, String department, String status, int mobileNo, Date createdDate,
			String createdBy, Date updatedDate, String updatedby, Country cid) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.status = status;
		this.mobileNo = mobileNo;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.updatedDate = updatedDate;
		this.updatedby = updatedby;
		this.cid = cid;
	}
	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getUpdatedby() {
		return updatedby;
	}
	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}
	public Country getCid() {
		return cid;
	}
	public void setCid(Country cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", status=" + status
				+ ", mobileNo=" + mobileNo + ", createdDate=" + createdDate + ", createdBy=" + createdBy
				+ ", updatedDate=" + updatedDate + ", updatedby=" + updatedby + ", cid=" + cid + "]";
	}
	

}
