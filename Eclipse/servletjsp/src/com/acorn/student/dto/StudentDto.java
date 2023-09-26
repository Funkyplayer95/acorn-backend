package com.acorn.student.dto;

public class StudentDto {
	private String sName;
	private String sRegionType; // 서울/비서울

	public StudentDto() {
	}

	public StudentDto(String sName, String sRegionType) {
		this.setsName(sName);
		this.setsRegionType(sRegionType);
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsRegionType() {
		return sRegionType;
	}

	public void setsRegionType(String sRegionType) {
		this.sRegionType = sRegionType;
	}
}
