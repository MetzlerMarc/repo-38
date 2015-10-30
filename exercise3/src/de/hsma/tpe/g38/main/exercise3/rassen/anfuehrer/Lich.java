package de.hsma.tpe.g38.main.exercise3.rassen.anfuehrer;

import de.hsma.tpe.g38.main.exercise3.rassen.Untoter;

/*
 *Das ist die Klasse Lich. Diese Klasse zeichnet sich durch spezielle Fähigkeiten aus und ist die
 *Anfuehrerklasse der Untoten.
 * 
 * @author Simon Karl und Christopher Troy
 */

public class Lich extends Untoter implements Anfuehrer {

	private double bonus = 2.3;
	private String beherrschtesElement = "Erde";

	/*
	 * Liefert den Bonus dieser Klasse
	 * 
	 * @return Bonus (2.3) des Wesens
	 */
	
	@Override
	public double getBonus() {
		return bonus;
	}

	/*
     * Liefert das beherrschte Element dieser Klasse
     * 
     * @return beherrschtes Element Elemnt () dieser Klasse
     */
	
	@Override
	public String getBeherrschtesElement() {
		return beherrschtesElement;
	}

	public Lich() {
		super();
		super.preis = 140;
	}
	
}
