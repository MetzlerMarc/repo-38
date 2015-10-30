package de.hsma.tpe.g38.main.exercise3.spiel;

import de.hsma.tpe.g38.main.exercise3.rassen.Mensch;
import de.hsma.tpe.g38.main.exercise3.rassen.Nachtelf;
import de.hsma.tpe.g38.main.exercise3.rassen.Ork;
import de.hsma.tpe.g38.main.exercise3.rassen.Untoter;
import de.hsma.tpe.g38.main.exercise3.rassen.anfuehrer.Erzmagier;
import de.hsma.tpe.g38.main.exercise3.rassen.anfuehrer.Farseer;
import de.hsma.tpe.g38.main.exercise3.rassen.anfuehrer.Lich;

public class Spiel {

	public static Spieler getSpieler1() {

		Spieler spieler = new Spieler("Chris", "erstes Team");
		spieler.kaufen(new Mensch());
		spieler.kaufen(new Untoter());
		spieler.kaufen(new Nachtelf());
		spieler.kaufen(new Ork());
		spieler.kaufen(new Mensch());
		spieler.kaufen(new Untoter());
		spieler.kaufen(new Nachtelf());
		spieler.kaufen(new Lich());
		return spieler;
	}

	public static Spieler getSpieler2() {

		Spieler spieler = new Spieler("Simon", "zweites Team");
		spieler.kaufen(new Mensch());
		spieler.kaufen(new Untoter());
		spieler.kaufen(new Nachtelf());
		spieler.kaufen(new Ork());
		spieler.kaufen(new Erzmagier());
		spieler.kaufen(new Farseer());

		return spieler;
	}

}