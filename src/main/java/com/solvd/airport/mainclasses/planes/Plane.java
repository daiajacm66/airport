package com.solvd.airport.mainclasses.planes;

import java.util.List;
import java.util.Objects;
import com.solvd.airport.Main;
import com.solvd.airport.enums.AirlineNames;

import org.apache.logging.log4j.core.Logger;

@SuppressWarnings("hiding")
public class Plane<Seat> {
	private static Logger LOGGER = Logger.getLogger(Main.class);
	private int identifier;
	private String idname;
	private int passengerNumber;
	private Enum<AirlineNames> company;
	private List<Seat> seats;

	public Plane(String idname, int capacity, Enum<AirlineNames> company, List<Seat> seats) {
		this.passengerNumber = capacity;
		this.idname = idname;
		this.company = company;
		this.seats = seats;
	}

	public Plane(int identifier, String idname, int capacity, Enum<AirlineNames> company) {
		this.identifier = identifier;
		this.idname = idname;
		this.passengerNumber = capacity;
		this.company = company;
	}

	public int getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(int id) {
		this.identifier = id;
	}

	public void setName(String idname) {
		this.idname = idname;
	}

	public String getName() {
		return this.idname;
	}

	public int getCapacity() {
		return this.passengerNumber;
	}

	public void setCapacity(Integer capacity) {
		this.passengerNumber = 350;
	}

	public ClassType getClassID() {
		return this.getClassID();
	}

	public List<Seat> getSeats() {
		return seats;
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}

	public void printData() {
		String a = toString();
		LOGGER.info(a);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + identifier;
		result = prime * result + ((idname == null) ? 0 : idname.hashCode());
		result = prime * result + passengerNumber;
		result = prime * result + ((seats == null) ? 0 : seats.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		@SuppressWarnings("unchecked")
		Plane<Seat> other = (Plane<Seat>) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (identifier != other.identifier)
			return false;
		if (idname == null) {
			if (other.idname != null)
				return false;
		} else if (!idname.equals(other.idname))
			return false;
		if (passengerNumber != other.passengerNumber)
			return false;
		if (seats == null) {
			if (other.seats != null)
				return false;
		} else if (!seats.equals(other.seats))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Plane [identifier=" + identifier + ", idname=" + idname + ", passengerNumber=" + passengerNumber
				+ ", company=" + company + ", seats=" + seats + ", getIdentifier()=" + getIdentifier() + ", getName()="
				+ getName() + ", getCapacity()=" + getCapacity() + ", getClassID()=" + getClassID() + ", getSeats()="
				+ getSeats() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}