package com.solvd.airport.interfaces;

public interface iPlaneState {
    void onTime();

    void boarding();

    void delayed();

    void cancelled();
}
