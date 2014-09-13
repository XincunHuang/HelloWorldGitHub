package com.hospital.main;

import com.hospital.model.Department;
import com.hospital.model.Patient;
import com.hospital.model.PatientVisitRequest;
import com.hospital.service.IScheduleService;
import com.hospital.service.impl.ScheduleServiceImpl;


public class Application {
    
	 
	
	public static void main(String[] args) {
		
		Patient patient = new Patient();
		patient.setPatientName("James Tam");
		patient.setAge(24);
		patient.setGender("Male");
		patient.setOccupation("Taxi Driver");
		patient.setCellPhone("342-435-0001");
		 
		IScheduleService service = new ScheduleServiceImpl();		
		
		PatientVisitRequest request = new PatientVisitRequest();
		request.setRequestId(1);
		request.setPatient(patient);
		request.setDepartment(Department.CARDIAC_SURGERY);
		request.setRequestDuration(90);
		
		String result = service.schedule(request);
		System.out.println(result);

	}
	

}
