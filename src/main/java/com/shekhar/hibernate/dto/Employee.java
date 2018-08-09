package com.shekhar.hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name="EMPLOYEE_DETAILS")
public class Employee {

	
	private int empID;
	private String name;
	private String address;
	@Id
	@Column(name ="EMPLOYEE_ID")
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	@Column(name ="EMPLOYEE_NAME")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name ="EMPLOYEE_ADDRESS")
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
