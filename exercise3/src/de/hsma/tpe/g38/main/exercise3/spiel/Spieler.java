package de.hsma.tpe.g38.main.exercise3.spiel;

import java.util.Scanner;

import de.hsma.tpe.g38.main.exercise3.rassen.Wesen;
import de.hsma.tpe.g38.main.exercise3.rassen.anfuehrer.Anfuehrer;

public final class Spieler {

	private static final Scanner scanner = Eingabe.getInstance();

	private final String name;
	private int kontostand = 2000;
	private final Squad squad;
	private boolean isAktiv = false;

	public String getName() {
		return name;
	}

	public int getKontostand() {
		return kontostand;
	}

	public Squad getSquad() {
		return squad;
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

		if (spielername == null) {
			throw new IllegalArgumentException("Spielername must not be null.");
		}

		if (squadname == null) {
			throw new IllegalArgumentException("Squadname must not be null.");
		}

		this.name = spielername;
		squad = new Squad(squadname);
	}

	public void createSquad() {

		System.out.println("\nWillkommen in der Team-Zusammenstellung!\n\n");

		boolean squadFertig = false;

		do {
			System.out.println("Wähle einen Charakter:\n\n");
			System.out.println(WesenFactory.getWesenListe());
			System.out.println("\n");
			System.out.println("0. Team-Zusammenstellung abschließen\n\n");
			System.out.println("Kontostand: " + kontostand + " E$\n\n");

			System.out.println(toString());

			try {
				int number = Integer.parseInt(scanner.nextLine());

				if (number == 0) {
					squadFertig = true;
				} else {
					WesenEnum wesenEnum = WesenEnum.getConstant(number);
					Wesen wesen = WesenFactory.getWesen(wesenEnum);
					buy(wesen);
				}
			} catch (IllegalArgumentException e) {
				System.err.println("Fehlerhafte Eingabe: Bitte nur die jeweilige Zahl eingeben.\n");
			}

		} while (squadFertig == false);
	}

	public void buy(final Wesen wesen) {

		if (wesen.isAnfuehrer() && squad.exists((Anfuehrer) wesen)) {
			System.err.println("Der Anführer (" + wesen.getName() + ") wurde nicht zum Squad von " + this.name
					+ " hinzugefügt. Nur 1 Anführer der jeweiligen Rasse erlaubt!\n");
		} else {
			if (wesen.getPreis() <= kontostand) {
				squad.addWesen(wesen);
				kontostand = kontostand - wesen.getPreis();
			} else {
				System.err.println("Das Wesen (" + wesen.getName() + ") wurde nicht zum Squad von " + this.name
						+ " hinzugefügt. Du besitzt nicht genügend Elfendollar, um es zu kaufen!\n");
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

		System.out.println("Das Wesen " + angreifendesWesen.getName());
		System.out.println(" von " + this.name + " hat dem Wesen " + angegriffenesWesen.getName());
		System.out.println(" von " + angegriffenerSpieler.getName() + " " + erteilterSchaden + " Schaden zugefügt.");
		System.out.println("\n");

		if (angegriffenesWesen.isLebendig() == false) {

			System.out.println("Das Wesen " + angegriffenesWesen.getName());
			System.out.println(" von " + angegriffenerSpieler.getName() + " hat den Angriff nicht überlebt!");

			angegriffenerSpieler.getSquad().removeWesen(angegriffenesWesen);
		} else {
			System.out.println("Es hat nun noch " + angegriffenesWesen.getLeben() + " Leben.");
		}
		System.out.println("\n----------------------------------");
		System.out.println(toString());
	}

	public boolean isDead() {

		if (squad.hasWesen() == false) {
			System.out.println(squad.getName() + "' von " + name + " ist geschlagen.\n");
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Spieler " + name + ", hat noch " + kontostand + " Elfendollar und tritt mit folgendem Squad an:\n"
				+ squad.toString();
	}

}