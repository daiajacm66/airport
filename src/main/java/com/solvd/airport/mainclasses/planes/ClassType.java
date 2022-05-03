package com.solvd.airport.mainclasses.planes;


public class ClassType {
    private String nameC;
    private int classID;

    public ClassType(String nameC, int classID) {
        this.nameC = nameC;
        this.classID = classID;
    }

    public String getNameC() {
        return this.nameC;
    }

    public int getClassID() {
        return this.classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }
}
