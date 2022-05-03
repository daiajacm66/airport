package com.solvd.airport.enums;

public enum Type {
	ECONOMY("economy"),
    PREMIUM_ECONOMY("premium economy"),
    BUSINESS("business"),
    FIRST_CLASS("first class");

    private String t;

    private Type(String type) {
        this.t = type;
    }

    public String getType(Type type) {
        return this.t;
    }
    
    public void setType(String t) {
        this.t = t;
    }
    
    public static Type takeSeat(String t) {
        for (Type type : Type.values()) {
            if (type.getType(type).equals(t)) {
                return type;
            }
        }
        return null;
    }
}
