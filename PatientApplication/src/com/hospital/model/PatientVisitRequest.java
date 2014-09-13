package com.hospital.model;

public class PatientVisitRequest {

	private long requestId;

	public long getRequestId() {
		return requestId;
	}
	public void setRequestId(long requestId) {
		this.requestId = requestId;
	}
	private Patient patient;
	private long requestDuration;
	private Department department;
 
   
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public long getRequestDuration() {
		return requestDuration;
	}
	public void setRequestDuration(long requestDuration) {
		this.requestDuration = requestDuration;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
}
