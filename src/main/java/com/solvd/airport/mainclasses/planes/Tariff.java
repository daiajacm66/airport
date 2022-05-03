package com.solvd.airport.mainclasses.planes;

public class Tariff {
    private double tariffimp;
    private ClassType classtype;

    public Tariff(double tariffimp, ClassType classtype) {
        this.tariffimp = tariffimp;
        this.classtype = classtype;
    }

    public double getTariff() {
        return this.tariffimp;
    }

    public void setTariff(double tariff) {
        this.tariffimp = tariff;
    }

    public ClassType getClassType() {
        return this.classtype;
    }

}
