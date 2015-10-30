package de.hsma.tpe.g38.main.exercise3.spiel;

import de.hsma.tpe.g38.main.exercise3.rassen.Wesen;

public class Spieler {

	private Squad squad;
	private double guthaben = 2000;
	private String name;

	public String getName() {
		return name;
	}

	public double getGuthaben() {
		return guthaben;
	}

	public Squad getSquad() {
		return squad;
	}

	public Spieler(String name, String squadName) {
		this.name = name;
		this.squad = new Squad(squadName);
	}

	public void kaufe(Wesen wesen) {

		double preis = wesen.getPreis();

		if (preis <= guthaben) {
			if (squad.isAnfueherInSquad(wesen) == false) {
				guthaben = guthaben - preis;
				squad.addWesen(wesen);
			}

		}
	}

	public boolean isGeschlagen() {
		if (squad.isDead() == true) {
			return true;
		} else {
			return false;
		}
	}

	public void attackiereSpieler(Spieler spieler) {

		Wesen randomWesen = spieler.getSquad().getRandomWesen();

		squad.getRandomWesen().attack(randomWesen);

		if (randomWesen.isLebendig() == false) {
			spieler.getSquad().deleteWesen(randomWesen);
		}
	}

}