package de.hsma.tpe.g38.main.exercise3.spiel;

import de.hsma.tpe.g38.main.exercise3.rassen.Wesen;

/**
 * Das ist die Klasse Player. Sie verwaltet die Spielerattribute und deren
 * Werte.
 * 
 * @author Simon Karl und Christopher Troy
 *
 */

public class Player {

	private Squad squad;
	private double budget = 2000;
	private String name;

	/**
	 * Getter zur Abfrage der Spielernamen, des aktuellen Budgets und Squads.
	 */

	public String getName() {
		return name;
	}

	public double getBudget() {
		return budget;
	}

	public Squad getSquad() {
		return squad;
	}

	/**
	 * Konstruktor der Klasse Player mit Namen für Spieler und Squad.
	 */

	public Player(String name, String squadName) {
		this.name = name;
		this.squad = new Squad(squadName);
	}

	/**
	 * Kauft Wesen mit verfügbarem Budget.
	 */

	public void buy(Wesen wesen) {

		double preis = wesen.getPreis();

		if (preis <= budget) {
			if (squad.isAnfuehrerInSquad(wesen) == false) {
				budget = budget - preis;
				squad.addWesen(wesen);
			}

		}
	}

	/**
	 * Überprüft ob alle Wesen im Team des Spielers gestorben sind.
	 */

	public boolean isDefeated() {
		if (squad.isDead() == true) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Greift ein zufällig gewähltes Wesen des Gegners an, fragt danach ab, ob
	 * das angegriffene Wesen gestorben ist und entfernt es gegebenenfalls aus
	 * dem Squad.
	 */

	public void attack(Player attackedPlayer) {

		Wesen attackingWesen = squad.getRandomWesen();
		Wesen attackedWesen = attackedPlayer.getSquad().getRandomWesen();

		double doneDamage = attackingWesen.attack(attackedWesen);

		System.out.println(attackingWesen.getName() + " von " + this.name + " hat " + attackedWesen.getName() + " von "
				+ attackedPlayer.getName() + " " + doneDamage + " Lebenspunkte abgezogen.");

		if (attackedWesen.isAlive() == false) {

			System.out.println(attackedWesen.getName() + " von " + attackedPlayer.getName() + " ist gestorben.");

			attackedPlayer.getSquad().deleteWesen(attackedWesen);
		} else {
			System.out.println(attackedWesen.getName() + " von " + attackedPlayer.getName() + " hat jetzt "
					+ attackedWesen.getLeben() + " Leben.");
		}
		System.out.println("\n\n\n");

	}

}