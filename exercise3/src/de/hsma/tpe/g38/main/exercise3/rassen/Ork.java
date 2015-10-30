package de.hsma.tpe.g38.main.exercise3.rassen;

/**
 * Das ist die Klasse Untoter, die von der Klasse Wesen erbt.
 * 
 * @author Simon Karl und Christopher Troy
 *
 */

public class Ork extends Wesen {

    /**
     * Erstellt einen Ork mit Leben(100), Schaden(33), Geschwindigkeit(1), Ruestung(0.30).
     */
	public Ork() {
		super(100, 33, 1, 0.30);
		super.preis = 150;
	}

}
