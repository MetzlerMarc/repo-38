package de.hsma.tpe.g38.main.exercise3;

import java.util.Scanner;

public class Spieler {


	private String name;
	private static final Scanner scanner = Eingabe.getInstance();
	public int elfendollar = 2000;

	public String setSquad() {
		
		System.out.println("Wähle einen Namen für dein Team...");

		this.name = Scanner.nextLine();

	}
}