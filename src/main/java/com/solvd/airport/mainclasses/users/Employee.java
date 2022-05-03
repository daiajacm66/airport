package com.solvd.airport.mainclasses.users;

import java.text.DateFormat;
import com.solvd.airport.enums.GenderType;

public class Employee extends Person {
    private long employeeID;
    private Charge charge;

    public Employee(long employeeID, Charge charge, String surname, String name, long dni, 
    		Enum<GenderType> gender, String phoneNumber, String passport, DateFormat dateOfBirth, int age) {
        super(surname, name, passport, dni, gender, phoneNumber, dateOfBirth, age);
        this.employeeID = employeeID;
        this.charge = charge;
    }

    public long getId() {
        return employeeID;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((charge == null) ? 0 : charge.hashCode());
		result = prime * result + (int) (employeeID ^ (employeeID >>> 32));
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
		Employee other = (Employee) obj;
		if (charge == null) {
			if (other.charge != null)
				return false;
		} else if (!charge.equals(other.charge))
			return false;
		if (employeeID != other.employeeID)
			return false;
		return true;
	}

	public void setId(long id) {
        this.employeeID = id;
    }

    public Charge getChargeID() {
        return this.charge;
    }

    public String getName() {
        return getName();
    }

    public String getSurname() {
        return getSurname();
    }

}
