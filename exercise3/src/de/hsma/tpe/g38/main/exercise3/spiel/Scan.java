package de.hsma.tpe.g38.main.exercise3.spiel;

import java.util.Scanner;

public final class Scan {

	private static Scanner INSTANCE;

	private Scan() {
	}

	public static Scanner getInstance() {

		if (INSTANCE == null) {
			INSTANCE = new Scanner(System.in);
		}
		return INSTANCE;
	}

	public static void close() {
		INSTANCE.close();
	}

}
