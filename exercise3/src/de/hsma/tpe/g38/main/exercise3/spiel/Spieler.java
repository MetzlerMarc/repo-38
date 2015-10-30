package de.hsma.tpe.g38.main.exercise3.spiel;

import java.util.Scanner;

import de.hsma.tpe.g38.main.exercise3.rassen.Wesen;
import de.hsma.tpe.g38.main.exercise3.rassen.anfuehrer.Anfuehrer;

public class Spieler {

	private String name;
	private Squad squad;
	private int geld = 2000;
	private boolean isAktiv = false;
	private static Scanner scanner = Scan.getInstance();

	public String getName() {
		return name;
	}

	public Squad getSquad() {
		return squad;
	}

	public int getGeld() {
		return geld;
	}

	public boolean isAktiv() {
		return isAktiv;
	}

	public void setAktiv(boolean isAktiv) {
		this.isAktiv = isAktiv;
	}

	public Spieler() {

		super();

		System.out.println("Spielername: ");
		this.name = scanner.nextLine();

		squad = new Squad();
	}

	public Spieler(String spielername, String squadname) {

		super();

		this.name = spielername;
		squad = new Squad(squadname);
	}

	public void createSquad() {

		System.out.println("\n Squaderstellung\n");

		boolean squadFertig = false;

		do {
			System.out.println("Wähle ein Wesen:\n\n");
			System.out.println(Wesen.getWesenListe() + "\n");
			System.out.println("0. Team fertig erstellt\n\n");
			System.out.println("Elfendollar: " + geld + " E$\n\n");

			System.out.println(toString());

			try {
				int number = Integer.parseInt(scanner.nextLine());

				if (number == 0) {
					squadFertig = true;
				} else {
					WesenEnum wesenEnum = WesenEnum.getConstant(number);
					Wesen wesen = WesenFactory.getWesen(wesenEnum);
					kaufen(wesen);
				}
			} catch (IllegalArgumentException e) {
				System.out.println("Falsch eingegeben. Bitte eine der genannten Zahlen eingeben.\n");
			}

		} while (squadFertig == false);
	}

	public void kaufen(Wesen wesen) {

		if (wesen.isAnfuehrer() && squad.exists((Anfuehrer) wesen)) {
			System.out.println("Ein zweiter Anführer, wie (" + wesen.getName() + "), ist nicht erlaubt\n");
		} else {
			if (wesen.getPreis() <= geld) {
				squad.addWesen(wesen);
				geld = geld - wesen.getPreis();
			} else {
				System.out.println("Nicht genug Geld um (" + wesen.getName() + ") zu kaufen!\n");
			}
		}
	}

	public boolean canAttack() {
		return squad.hasWesen();
	}

	public void attack(Spieler angegriffenerSpieler) {

		Wesen angreifendesWesen = squad.getRandomWesen();
		Wesen angegriffenesWesen = angegriffenerSpieler.getSquad().getRandomWesen();

		double erteilterSchaden = angreifendesWesen.attack(angegriffenesWesen);

		System.out.println(angreifendesWesen.getName() + " von " + this.name + " hat " + angegriffenesWesen.getName());
		System.out.println(" von " + angegriffenerSpieler.getName() + " " + erteilterSchaden + " abgezogen.\n");

		if (angegriffenesWesen.isLebendig() == false) {

			System.out.println("Das Wesen " + angegriffenesWesen.getName() + " von " + angegriffenerSpieler.getName()
					+ " ist gestorben.");

			angegriffenerSpieler.getSquad().removeWesen(angegriffenesWesen);
		} else {
			System.out.println("Es hat jetzt " + angegriffenesWesen.getLeben() + " Leben.");
		}
		System.out.println("\n" + toString());
	}

	public boolean isTot() {

		if (squad.hasWesen() == false) {
			System.out.println(squad.getName() + "' von " + name + " hat keine Wesen mehr.\n");
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Spieler " + name + ", besitzt immer noch " + geld + " Elfendollar. Sein Squad besteht aus: \n"
				+ squad.toString();
	}

}