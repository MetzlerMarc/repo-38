package de.hsma.tpe.g38.main.exercise3.rassen;

/**
 * Das ist die Klasse Mensch, die von der Klasse Wesen erbt.
 * 
 * @author Simon Karl und Christopher Troy
 *
 */

public class Mensch extends Wesen {

    /**
     * Erstellt einen Menschen mit Leben(140), Schaden(40), Geschwindigkeit(2), Ruestung(0.40).
     */
	public Mensch() {
		super(140, 40, 2, 0.40);
		super.preis = 110;
	}

}
