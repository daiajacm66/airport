package com.solvd.airport;

import java.util.Scanner;

import com.solvd.airport.utils.Logger;

public class Menu {
	private static Logger LOGGER = Logger.getLogger(Main.class);
	private static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		System.out.println("WELCOME TO AIRPORT SOLVD!!"
				+ "This program is a simulation of an airport"
				+ "\t You can only see the flights are avairables, dates and individual costs.");
		int option = sc.nextInt();
		do {
			switch (option) {
				case 0:
					LOGGER.info("Exiting");
					break;
				case 1:
					LOGGER.info(man.flightslist);
					break;
				case 2:
					
					break;
				default:
					;
			}
		}while (option != 0);
	}
	
}
