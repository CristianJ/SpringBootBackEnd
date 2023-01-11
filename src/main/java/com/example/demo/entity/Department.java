package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



	@Table(name = "Departments")
	@Entity
	public class Department extends GenericFields implements Serializable {

		
		private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long Id;
		
		private String description;
		private String name;
		private String phone;
		
		@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","enterprise"})
		@ManyToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "id_enterprise", nullable = false, referencedColumnName="id")
	    private Enterprise enterprise;
		
		
		
		
		public Enterprise getEnterprise() {
			return enterprise;
		}
		public void setEnterprise(Enterprise enterprise) {
			this.enterprise = enterprise;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		

		
		
	}

