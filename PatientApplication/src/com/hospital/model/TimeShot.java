package com.hospital.model;

import java.util.HashMap;
import java.util.Map;

public class TimeShot {

	private WeekDays weekday;
	
	private Map<String,Boolean> timeShotMap = new HashMap<String,Boolean>();
	
	public Map<String, Boolean> getTimeShotMap() {
		return timeShotMap;
	}
	public void setTimeShotMap(Map<String, Boolean> timeShotMap) {
		this.timeShotMap = timeShotMap;
	}
	public WeekDays getWeekday() {
		return weekday;
	}
	public void setWeekday(WeekDays weekday) {
		this.weekday = weekday;
	}
 
    public TimeShot(){     

		//shot1 is  9-9:30;
		timeShotMap.put("shot1", true);
		//shot2 is  9:30-10:00;
		timeShotMap.put("shot2", true);
		//shot3 is  10-10:30;
		timeShotMap.put("shot3", true);
		//shot4 is  10:30-11:00;
		timeShotMap.put("shot4", true);
		//shot5 is  11-11:30;
		timeShotMap.put("shot5", true);
		//shot6 is  11:30-12;
		timeShotMap.put("shot6", true);
		//shot7 is  12-12:30;
		timeShotMap.put("shot7", true);
		//shot8 is  12:30-13;
		timeShotMap.put("shot8", true);
		//shot9 is  13-13:30;
		timeShotMap.put("shot9", true);
		//shot10 is  13:30-14;
		timeShotMap.put("shot10", true);
		//shot11 is  14-14:30;
		timeShotMap.put("shot11", true);
		//shot12 is  14:30-15;
		timeShotMap.put("shot12", true);
		//shot13 is  15-15:30;
		timeShotMap.put("shot13", true);
		//shot14 is  15:30-16;
		timeShotMap.put("shot14", true);
		//shot15 is  16-16:30;
		timeShotMap.put("shot15", true);
		//shot16 is  16:30-17;
		timeShotMap.put("shot16", true);
		
    	
    }
	
}
