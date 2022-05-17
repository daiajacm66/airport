package com.solvd.airport.interfaces;

@FunctionalInterface
public interface IPassAdultL<T> {
	boolean isAdult(int a, int b);
}
