package de.hsma.tpe.g38.main.exercise3.spiel;

public class GameController {

	private int runde;

	public int getRunde() {
		return runde;
	}

	public static void main(String[] args) {
		GameController gameController = new GameController();
		gameController.runGame();
	}

	public void runGame() {

		Spieler spieler1 = Simulation.getSpieler1();
		Spieler spieler2 = Simulation.getSpieler2();

		while (spieler1.isGeschlagen() == false && spieler2.isGeschlagen() == false) {

			runde++;

			spieler1.attackiereSpieler(spieler2);

			if (spieler2.isGeschlagen() == true) {
				System.out.println("Spieler2 ist geschlagen. Spieler1 hat gewonnen ");
				break;
			}

			spieler2.attackiereSpieler(spieler1);

			if (spieler1.isGeschlagen() == true) {
				System.out.println("Spieler1 ist geschlagen. Spieler2 hat gewonnen ");
				break;
			}
		}

	}

}