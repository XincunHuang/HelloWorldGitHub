package com.hospital.model;

import java.util.List;

public class Doctor {

	private long id;
	private String name;
	private String gender;
	private Department department;
	private String cellPhone;
	private List<TimeShot> timeShot ;
	
	private WeekDays weekday;
	
	 
	public List<TimeShot> getTimeShot() {
		return timeShot;
	}
	public void setTimeShot(List<TimeShot> timeShot) {
		this.timeShot = timeShot;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department orthopedic) {
		this.department = orthopedic;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
}
