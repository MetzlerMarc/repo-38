package de.hsma.tpe.g38.main.exercise3.spiel;

public class GameController {

	private int round;

	private Spieler spieler1;
	private Spieler spieler2;

	public int getRound() {
		return round;
	}

	public Spieler getSpieler1() {
		return spieler1;
	}

	public Spieler getSpieler2() {
		return spieler2;
	}

	public GameController() {
		super();
	}

	public Spieler getAktuellerSpieler() {

		if (spieler1.isAktiv()) {
			return spieler1;
		} else {
			return spieler2;
		}
	}

	public void setupGame() {

		spieler1 = new Spieler();
		spieler1.createSquad();
		System.out
				.println("\nDie Team-Zusammenstellung von Spieler 1 ist abgeschlossen. Spieler 2 ist an der Reihe.\n");
		spieler2 = new Spieler();
		spieler2.createSquad();
	}

	public void setupGameWithTeams() {
		spieler1 = Spiel.getSpieler1();
		spieler2 = Spiel.getSpieler2();
	}

	public void runGame() {

		System.out.println("\n\n" + spieler1.toString() + "\n\n" + spieler2.toString());
		System.out.println("\nDer Kampf beginnt!\n--------------------\n");

		while (spieler1.canAttack() && spieler2.canAttack()) {

			round++;
			System.out.println("\n\nRunde: " + round);

			spieler1.setAktiv(true);
			spieler2.setAktiv(false);
			spieler1.attack(spieler2);

			if (spieler2.isDead()) {
				System.out.println("Glückwunsch!!! " + spieler1.getName() + " hat die Runde gewonnen.\n");
				System.out.println("Im Squad von " + spieler1.getName() + " haben noch "
						+ spieler1.getSquad().getWesen().size() + " Wesen überlebt.\n");
				break;
			}

			spieler2.setAktiv(true);
			spieler1.setAktiv(false);
			spieler2.attack(spieler1);

			if (spieler1.isDead()) {
				System.out.println("Glückwunsch!!! " + spieler2.getName() + " hat die Runde gewonnen.\n");
				System.out.println("Im Squad von " + spieler2.getName() + " haben noch "
						+ spieler2.getSquad().getWesen().size() + " Wesen überlebt.\n");
				break;
			}
		}
	}

}
