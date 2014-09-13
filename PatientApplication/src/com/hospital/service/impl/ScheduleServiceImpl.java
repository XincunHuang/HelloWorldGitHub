package com.hospital.service.impl;

import java.util.List;

import com.hospital.model.Doctor;
import com.hospital.model.PatientVisitRequest;
import com.hospital.service.IDoctorService;
import com.hospital.service.IScheduleService;

public class ScheduleServiceImpl implements IScheduleService {

	@Override
	public String schedule(PatientVisitRequest request) {
		
		String message = "";
		
		IDoctorService service = new DoctorServiceImpl();
		
		List<Doctor> list = service.getDoctorsByDepartment(request.getDepartment());
		
		Doctor docor = service.getAvailableDoctors(list,request);
		
		if(null == docor)		
		   message = "All Doctors are not availble this week,please make an appointment at next week.";
		else 
			message = "Your appointment was made successfully.";
		
		return message;
	}

}
