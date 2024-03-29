package de.hsma.tpe.g38.main.exercise3.spiel;

import de.hsma.tpe.g38.main.exercise3.rassen.Mensch;
import de.hsma.tpe.g38.main.exercise3.rassen.Nachtelf;
import de.hsma.tpe.g38.main.exercise3.rassen.Ork;
import de.hsma.tpe.g38.main.exercise3.rassen.Untoter;
import de.hsma.tpe.g38.main.exercise3.rassen.anfuehrer.Erzmagier;
import de.hsma.tpe.g38.main.exercise3.rassen.anfuehrer.Lich;

/**
 * Das ist die Klasse Simulation. Sie beinhaltet zwei Squads, die ohne weitere
 * Benutzereingaben gegeneinander einen Kampf simulieren.
 * 
 * * @author Simon Karl und Christopher Troy
 */

public class Simulation {

	/**
	 * erzeugter Squad von Spieler 1.
	 */

	public static Player getPlayer1() {

		Player player = new Player("Chris", "Die Zerstörer");
		player.buy(new Mensch());
		player.buy(new Untoter());
		player.buy(new Nachtelf());
		player.buy(new Ork());
		player.buy(new Mensch());
		player.buy(new Untoter());
		player.buy(new Nachtelf());
		player.buy(new Lich());

		return player;
	}

	/**
	 * erzeugter Squad von Spieler 2.
	 */

	public static Player getPlayer2() {

		Player player = new Player("Simon", "Die Vernichter");
		player.buy(new Mensch());
		player.buy(new Untoter());
		player.buy(new Nachtelf());
		player.buy(new Ork());
		player.buy(new Erzmagier());
		player.buy(new Mensch());

		return player;
	}

}