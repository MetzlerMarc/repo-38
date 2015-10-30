package de.hsma.tpe.g38.main.exercise3.rassen;

/**
 * Das ist die Klasse Untoter, die von der Klasse Wesen erbt.
 * 
 * @author Simon Karl und Christopher Troy
 *
 */

public class Untoter extends Wesen {

    /**
     * Erstellt einen Untoten mit Leben(120), Schaden(16), Geschwindigkeit(2), Ruestung(0.30).
     */
	public Untoter() {
		super(120, 16, 2, 0.30);
		super.preis = 70;
	}

}
