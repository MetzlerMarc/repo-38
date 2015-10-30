package de.hsma.tpe.g38.main.exercise3.spiel;

public class GameController {

	private int round;

	public int getRound() {
		return round;
	}

	public static void main(String[] args) {
		GameController gameController = new GameController();
		gameController.runGame();
	}

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