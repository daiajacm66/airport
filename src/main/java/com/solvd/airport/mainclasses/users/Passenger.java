package com.solvd.airport.mainclasses.users;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import com.solvd.airport.enums.GenderType;


public class Passenger extends Person {
    private long code;
    private String email;
    private boolean ischeckInFlight;
    // ArrayList<Flight> aprobbedFlights = new ArrayList<>();
    
    public Passenger() {}
    public Passenger(String surname, String name, long dni, String phoneNumber, String email,
            long code, String passport, Enum<GenderType> gender, DateFormat dateOfBirth, int age) {
        super(surname, name, passport, dni, gender, phoneNumber, dateOfBirth, age);
        this.email = email;
        this.code = code;
        this.ischeckInFlight = false;
    }

    public boolean isIscheckInFlight() {
		return ischeckInFlight;
	}

	public void setIscheckInFlight(boolean ischeckInFlight) {
		this.ischeckInFlight = ischeckInFlight;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (int) (code ^ (code >>> 32));
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + (ischeckInFlight ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passenger other = (Passenger) obj;
		if (code != other.code)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (ischeckInFlight != other.ischeckInFlight)
			return false;
		return true;
	}

	public String getEmail() {

        return this.email;
    }

    public void setmail(String email) {

        this.email = email;
    }

    public long getCode() {
        return this.code;
    }

    public void sayHello(String surname, String name) {
        System.out.println("Hello, my name is " + surname + name + ".");
    }

    public boolean isCheckedInFlight() {
        return ischeckInFlight;
    }

    public void setCheckedInFlight(boolean checkInFlight) {
        ischeckInFlight = checkInFlight;
    }
    
    public static int getAge() {
        return this.getAge();
    }
    @Override
    public String toString() {
    	return "\\tSurname: " + super.getSurname()
    	+ "\tName: " + super.getName() + "\tDNI: " + super.dni()
    	+ "\tPassport: " + super.getPassport() 
    	+ "\tPhone Number: " + super.getPhoneNumber() 
    	+ "\tE-mail: " + this.email
    	+ "\tDate of birth: " + super.getDateOfBirth();
    }

}