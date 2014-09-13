package com.hospital.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.hospital.model.Department;
import com.hospital.model.Doctor;
import com.hospital.model.PatientVisitRequest;
import com.hospital.model.TimeShot;
import com.hospital.model.WeekDays;
import com.hospital.service.IDoctorService;

public class DoctorServiceImpl implements IDoctorService {

	@Override
	public List<Doctor> getDoctorsByDepartment(Department department) {


		//we should query the doctors by the department from db, now I just simulate it.
		
		List<Doctor> doctorList = new ArrayList<Doctor>();
		
		if(department.equals(Department.ORTHOPEDIC)){
			Doctor doctor = new Doctor();
			doctor.setId(1);
			doctor.setName("Tom Edison");
			doctor.setDepartment(Department.ORTHOPEDIC);
			List<String> blockoff = new ArrayList<String>();
			blockoff.add("shot3");
			blockoff.add("shot4");			
			List<TimeShot> timeList = new ArrayList<TimeShot>();
			timeList.add(getTimeout(blockoff,WeekDays.MONDAY));	
			doctor.setTimeShot(timeList);
			doctorList.add(doctor);
			
			
			blockoff = new ArrayList<String>();
			blockoff.add("shot1");
			blockoff.add("shot2");			
			timeList = new ArrayList<TimeShot>();
			timeList.add(getTimeout(blockoff,WeekDays.TUESDAY));	
			doctor.setTimeShot(timeList);
			doctorList.add(doctor);
			
			
			blockoff = new ArrayList<String>();
			blockoff.add("shot3");
			blockoff.add("shot4");			
			timeList = new ArrayList<TimeShot>();
			timeList.add(getTimeout(blockoff,WeekDays.WEDNESDAY));	
			doctor.setTimeShot(timeList);
			doctorList.add(doctor);
			
			
			blockoff = new ArrayList<String>();
			blockoff.add("shot11");
			blockoff.add("shot12");			
			timeList = new ArrayList<TimeShot>();
			timeList.add(getTimeout(blockoff,WeekDays.THURSDAY));	
			doctor.setTimeShot(timeList);
			doctorList.add(doctor);
			
			blockoff = new ArrayList<String>();
			blockoff.add("shot13");
			blockoff.add("shot14");			
			timeList = new ArrayList<TimeShot>();
			timeList.add(getTimeout(blockoff,WeekDays.MONDAY));		
			doctor.setTimeShot(timeList);
			doctorList.add(doctor);
			
			
			
			
			
		}else if(department.equals(Department.CARDIAC_SURGERY)){
			Doctor doctor = new Doctor();
			doctor.setId(2);
			doctor.setName("Jeremy Lee");
			doctor.setDepartment(Department.CARDIAC_SURGERY);		
			doctorList.add(doctor);
		}else if(department.equals(Department.UROLOGY)){
			Doctor doctor = new Doctor();
			doctor.setId(3);
			doctor.setName("David Cody");
			doctor.setDepartment(Department.UROLOGY);	
			doctorList.add(doctor);
		}
			
		
		return doctorList;
	}

	public TimeShot getTimeout(List<String> blockoff,WeekDays weekDay){		
		
		TimeShot time = new TimeShot();			
		time.setWeekday(weekDay);
		Map<String, Boolean> map = time.getTimeShotMap();
		for(String block:blockoff){
			map.put(block, false);
		}
		return time;
	}
	
	@Override
	public Doctor getAvailableDoctors(List<Doctor> doctorList,PatientVisitRequest request) {
	
		
		long times = request.getRequestDuration()/30;
		for(Doctor doctor:doctorList){
			List<TimeShot> list = doctor.getTimeShot();
			for(TimeShot time:list){
				Map<String, Boolean> map = time.getTimeShotMap();
				int i=1;
				int count = 0;
				List<String> shotName = new ArrayList<String>();
				
				while(count<times){
					if(map.get("shot"+i)){
						shotName.add("shot"+i);
					}else{
						count = 0;
						shotName = new ArrayList<String>(); 
					}
				}
				if(shotName.size()==times){
					for(String shot:shotName)
						map.put(shot, false);
					time.setTimeShotMap(map);
					return doctor;
				}
					
			}
		}
		return null;
	}

}
