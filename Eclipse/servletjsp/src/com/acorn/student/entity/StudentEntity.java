package com.acorn.student.entity;

public class StudentEntity{
	private String sFirstName;
	private String sLastName;
	private String sAddress;
	
	public StudentEntity() {
	}
	
	public StudentEntity(String sFirstName, 
			String sLastName, String sAddress) {
		this.sFirstName = sFirstName;
		this.sLastName = sLastName;
		this.sAddress = sAddress;
	}
	public String getsFirstName() {
		return sFirstName;
	}
	public void setsFirstName(String sFirstName) {
		this.sFirstName = sFirstName;
	}
	public String getsLastName() {
		return sLastName;
	}
	public void setsLastName(String sLastName) {
		this.sLastName = sLastName;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
}
