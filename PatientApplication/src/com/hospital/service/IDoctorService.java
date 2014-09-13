package com.hospital.service;

import java.util.List;

import com.hospital.model.Department;
import com.hospital.model.Doctor;
import com.hospital.model.Patient;
import com.hospital.model.PatientVisitRequest;

public interface IDoctorService {

	public List<Doctor> getDoctorsByDepartment(Department department);
	
	public Doctor getAvailableDoctors(List<Doctor> doctorList,PatientVisitRequest request);
}
