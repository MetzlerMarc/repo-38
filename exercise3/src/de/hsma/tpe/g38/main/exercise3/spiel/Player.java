package de.hsma.tpe.g38.main.exercise3.spiel;

import de.hsma.tpe.g38.main.exercise3.rassen.Wesen;

/**
 * Das ist die Klasse Player. Sie verwaltet die Spielerattribute und deren Werte.
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

	public void attackPlayer(Player player) {

		Wesen randomWesen = player.getSquad().getRandomWesen();

		squad.getRandomWesen().attack(randomWesen);

		if (randomWesen.isAlive() == false) {
			player.getSquad().deleteWesen(randomWesen);
		}
	}

}