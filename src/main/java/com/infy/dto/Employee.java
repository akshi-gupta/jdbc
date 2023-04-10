package com.infy.dto;

import lombok.*;

import java.sql.Timestamp;
import java.util.Date;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Employee {

	private int employeeId;
	private String firstName;
	private String lastName;
	private String address;
	private int baseLoc;
	private int deptNbr;
	private int jobNbr;
	private String activeStatus;
	private Date termDate;
	private Timestamp lastChgTs;

	public Employee() {

	}

	public Employee(int employeeId, String firstName, String lastName, String address, int baseLoc, int deptNbr,
			int jobNbr, String activeStatus, Date termDate, Timestamp lastChgTs) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.baseLoc = baseLoc;
		this.deptNbr = deptNbr;
		this.jobNbr = jobNbr;
		this.activeStatus = activeStatus;
		this.termDate = termDate;
		this.lastChgTs = lastChgTs;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getBaseLoc() {
		return baseLoc;
	}

	public void setBaseLoc(int baseLoc) {
		this.baseLoc = baseLoc;
	}

	public int getDeptNbr() {
		return deptNbr;
	}

	public void setDeptNbr(int deptNbr) {
		this.deptNbr = deptNbr;
	}

	public int getJobNbr() {
		return jobNbr;
	}

	public void setJobNbr(int jobNbr) {
		this.jobNbr = jobNbr;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public Date getTermDate() {
		return termDate;
	}

	public void setTermDate(Date termDate) {
		this.termDate = termDate;
	}

	public Timestamp getLastChgTs() {
		return lastChgTs;
	}

	public void setLastChgTs(Timestamp lastChgTs) {
		this.lastChgTs = lastChgTs;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", baseLoc=" + baseLoc + ", deptNbr=" + deptNbr + ", jobNbr=" + jobNbr
				+ ", activeStatus=" + activeStatus + ", termDate=" + termDate + ", lastChgTs=" + lastChgTs + "]";
	}

}
