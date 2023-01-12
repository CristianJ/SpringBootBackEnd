package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@MappedSuperclass
public class GenericFields{
	/**
	 * 
	 */
	
	
	
	@Column(name="created_by")
	private int createdBy;
	
	@Column(name="modified_by")
	
	private int modifiedBy;
	
	@Column(name="modified_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedDate;
	private Boolean status;
	
	@PrePersist
	public void prePersist() {
		this.createdBy=1;
		this.modifiedBy=1;
		this.modifiedDate=new Date();
		this.status=true;
	}
	
	
	public int getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}



	public int getModifiedBy() {
		return modifiedBy;
	}


	public void setModifiedBy(int modifiedBy) {
		this.modifiedBy = modifiedBy;
	}


	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
}