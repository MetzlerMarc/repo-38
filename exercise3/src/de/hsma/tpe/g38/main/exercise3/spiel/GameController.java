package de.hsma.tpe.g38.main.exercise3.spiel;

/**
 * Das ist die Klasse GameController. Sie simuliert und steuert das
 * rundenbasierte Spielgeschehen.
 * 
 * @author Simon Karl und Christopher Troy
 *
 */

public class GameController {

	private int round;

	public int getRound() {
		return round;
	}

	/**
	 * Main Methode startet das Spiel.
	 */

	public static void main(String[] args) {
		GameController gameController = new GameController();
		gameController.runGame();
	}

	/**
	 * Lässt Spieler 1 und 2 im Wechsel sich gegenseitig angreifen. Runde erhöht
	 * sich um 1, nachdem beide ihre Attacken ausgeführt haben.
	 */

	public void runGame() {

		Player player1 = Simulation.getPlayer1();
		Player player2 = Simulation.getPlayer2();

		while (player1.isDefeated() == false && player2.isDefeated() == false) {

			round++;

			player1.attackPlayer(player2);

			if (player2.isDefeated() == true) {
				System.out.println("Spieler 2 hat keine lebendigen Wesen mehr. Spieler 1 hat gewonnen!");
				break;
			}

			player2.attackPlayer(player1);

			if (player1.isDefeated() == true) {
				System.out.println("Spieler 1 hat keine lebendigen Wesen mehr. Spieler 2 hat gewonnen!");
				break;
			}
		}

	}

}