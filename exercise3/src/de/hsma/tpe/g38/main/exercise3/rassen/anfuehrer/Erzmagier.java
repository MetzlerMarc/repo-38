package de.hsma.tpe.g38.main.exercise3.rassen.anfuehrer;

import de.hsma.tpe.g38.main.exercise3.rassen.Mensch;

/**
 *Das ist die Klasse Erzmagier. Diese Klasse zeichnet sich durch spezielle Fähigkeiten aus und ist die
 *Anfuehrerklasse der Menschen.
 * 
 * @author Simon Karl und Christopher Troy
 */

public class Erzmagier extends Mensch implements Anfuehrer {

	private double bonus = 5.0;
	private String beherrschtesElement = "Wasser";

	/**
     * Liefert den Bonus dieser Klasse
     * 
     * @return Bonus (5.0) des Wesens
     */
	@Override
	public double getBonus() {
		return bonus;
	}

	/**
     * Liefert das beherrschte Element dieser Klasse
     * 
     * @return beherrschtes Element Elemnt () dieser Klasse
     */
	@Override
	public String getBeherrschtesElement() {
		return beherrschtesElement;
	}
	
	/**
	 * Erstellt einen Erzmagier mit Leben(140), Schaden(40), Geschwindigkeit(2), Ruestung(0.40).
	 */
	public Erzmagier() {
		super();
		super.preis = 220;
	}

}
