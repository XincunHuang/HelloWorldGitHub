package com.hospital.model;
import java.util.List;


public class DoctorSchedule {

	private long scheduleId;
	private List<Doctor> doctorList;	
	private String blockOffTimeShot;
	
	public long getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(long scheduleId) {
		this.scheduleId = scheduleId;
	}

	public List<Doctor> getDoctorList() {
		return doctorList;
	}

	public void setDoctorList(List<Doctor> doctorList) {
		this.doctorList = doctorList;
	}

	public String getBlockOffTimeShot() {
		return blockOffTimeShot;
	}

	public void setBlockOffTimeShot(String blockOffTimeShot) {
		this.blockOffTimeShot = blockOffTimeShot;
	}

}
