package com.solvd.airport.utils;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Possible {
	 public int calculateAge(int year, int month, int day) {
	    	Calendar birth = new GregorianCalendar(year,month,day);
	    	Calendar today = Calendar.getInstance();
	    	int byear = birth.get(Calendar.YEAR);
	    	int tyear = today.get(Calendar.YEAR);
	    	int age = tyear - byear;
	    	return age;
	    }
	 
	 //passenger1.calculateAge(1998,06,06);
     //passenger2.calculateAge(1973,04,28);
     //passenger3.calculateAge(1998,04,8);
     //passenger4.calculateAge(1993,11,12);
     //passenger5.calculateAge(1965,03,02);
}
