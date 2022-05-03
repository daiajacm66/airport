package com.solvd.airport;

@FunctionalInterface
public interface IPassAdultL<T> {
	boolean isAdult(int a, int b);
}
