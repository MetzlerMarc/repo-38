package de.hsma.tpe.g38.main.exercise3.spiel;

import de.hsma.tpe.g38.main.exercise3.rassen.Wesen;

public class Player {

	private Squad squad;
	private double budget = 2000;
	private String name;

	public String getName() {
		return name;
	}

	public double getBudget() {
		return budget;
	}

	public Squad getSquad() {
		return squad;
	}

	public Player(String name, String squadName) {
		this.name = name;
		this.squad = new Squad(squadName);
	}

	public void buy(Wesen wesen) {

		double preis = wesen.getPreis();

		if (preis <= budget) {
			if (squad.isAnfuehrerInSquad(wesen) == false) {
				budget = budget - preis;
				squad.addWesen(wesen);
			}

		}
	}

	public boolean isDefeated() {
		if (squad.isDead() == true) {
			return true;
		} else {
			return false;
		}
	}

	public void attackPlayer(Player player) {

		Wesen randomWesen = player.getSquad().getRandomWesen();

		squad.getRandomWesen().attack(randomWesen);

		if (randomWesen.isAlive() == false) {
			player.getSquad().deleteWesen(randomWesen);
		}
	}

}