package com.solvd.airport.utils;

import com.solvd.airport.Main;

public class Logger {
    public static final Logger LOGGER = Logger.getLogger(null);
    public void debug(String string) {
    }

	public static Logger getLogger() {
		return LOGGER;
	}

	public static Logger getLogger(Class<Main> class1) {
		// TODO Auto-generated method stub
		return null;
	}

	public void info(String string) {
		// TODO Auto-generated method stub
	}
}
