package de.hsma.tpe.g38.main.exercise3.rassen;

/**
 * Das ist die Klasse Nachtelf, die von der Klasse Wesen erbt.
 * 
 * @author Simon Karl und Christopher Troy
 *
 */

public class Nachtelf extends Wesen {

    /**
     * Erstellt einen Nachtelf mit Leben(120), Schaden(15), Geschwidnigkeit(3), Ruestung(0.20).
     */
	public Nachtelf() {
		super(120, 15, 3, 0.20);
		super.preis = 145;
	}
	
}
