package com.solvd.airport.mainclasses.users;

public class Charge {
    private long chargeID;
    private String name;
    private String description;
    
    public Charge(String name) {
    	this.name = name;
    }
    public Charge(long chargeID, String name, String description) {
        this.chargeID = chargeID;
        this.name = name;
        this.description = description;
    }

    public long getChargeID() {
		return chargeID;
	}

	public void setChargeId(Long chargeID) {
        this.chargeID = chargeID;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (chargeID ^ (chargeID >>> 32));
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Charge other = (Charge) obj;
		if (chargeID != other.chargeID)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
