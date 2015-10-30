package de.hsma.tpe.g38.main.exercise3.spiel;

import de.hsma.tpe.g38.main.exercise3.rassen.Ork;
import de.hsma.tpe.g38.main.exercise3.rassen.Untoter;
import de.hsma.tpe.g38.main.exercise3.rassen.anfuehrer.Erzmagier;
import de.hsma.tpe.g38.main.exercise3.rassen.anfuehrer.Farseer;

public final class Spiel {

	public static Spieler getSpieler1() {

		Spieler spieler = new Spieler("Chris", "erstes Team");
		spieler.buy(new Untoter());
		spieler.buy(new Untoter());
		spieler.buy(new Untoter());
		spieler.buy(new Untoter());
		spieler.buy(new Untoter());
		spieler.buy(new Untoter());
		spieler.buy(new Untoter());
		spieler.buy(new Untoter());
		spieler.buy(new Untoter());
		spieler.buy(new Untoter());
		return spieler;
	}

	public static Spieler getSpieler2() {

		Spieler spieler= new Spieler("Simon", "zweites Team");
		spieler.buy(new Ork());
		spieler.buy(new Untoter());
		spieler.buy(new Untoter());
		spieler.buy(new Erzmagier());
		spieler.buy(new Erzmagier());
		spieler.buy(new Farseer());

		return spieler;
	}

}