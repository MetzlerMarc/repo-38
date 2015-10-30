package de.hsma.tpe.g38.main.exercise3.spiel;

import de.hsma.tpe.g38.main.exercise3.rassen.Mensch;
import de.hsma.tpe.g38.main.exercise3.rassen.Nachtelf;
import de.hsma.tpe.g38.main.exercise3.rassen.Ork;
import de.hsma.tpe.g38.main.exercise3.rassen.Untoter;
import de.hsma.tpe.g38.main.exercise3.rassen.anfuehrer.Erzmagier;
import de.hsma.tpe.g38.main.exercise3.rassen.anfuehrer.Farseer;
import de.hsma.tpe.g38.main.exercise3.rassen.anfuehrer.Lich;

public class Simulation {

	public static Spieler getSpieler1() {

		Spieler spieler = new Spieler("Chris", "erstes Team");
		spieler.kaufe(new Mensch());
		spieler.kaufe(new Untoter());
		spieler.kaufe(new Nachtelf());
		spieler.kaufe(new Ork());
		spieler.kaufe(new Mensch());
		spieler.kaufe(new Untoter());
		spieler.kaufe(new Nachtelf());
		spieler.kaufe(new Lich());
		return spieler;
	}

	public static Spieler getSpieler2() {

		Spieler spieler = new Spieler("Simon", "zweites Team");
		spieler.kaufe(new Mensch());
		spieler.kaufe(new Untoter());
		spieler.kaufe(new Nachtelf());
		spieler.kaufe(new Ork());
		spieler.kaufe(new Erzmagier());
		spieler.kaufe(new Farseer());

		return spieler;
	}

}